package com.xiaomi.learn.gson;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Box {

    @SerializedName("w")
    private int width;

    @SerializedName("h")
    private int height;

    @SerializedName("d")
    private int depth;

    // Methods removed for brevity


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Box box = new Box();
        box.setDepth(100);
        box.setHeight(100);
        box.setWidth(100);
        System.out.println(gson.toJson(box));
    }
}
