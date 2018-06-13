package com.xiaomi.learn.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class Account {

    @Expose(deserialize = false)
    private String accountNumber;

    @Expose
    private String iban;

    @Expose(serialize = false)
    private String owner;

    @Expose(serialize = false, deserialize = false)
    private String address;

    private String pin;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("123");
        account.setAddress("beijing");
        account.setIban("iban");
        account.setOwner("wei");
        account.setPin("2122423");

        final GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(account));
    }

}
