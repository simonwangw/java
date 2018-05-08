package com.alibaba.study.spi;

import java.util.ServiceLoader;

public class SpiMain {

    public static void main(String[] args) {
        ServiceLoader<HelloInterface> serviceLoader = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface i : serviceLoader) {
            i.sayHello();
        }
    }
}
