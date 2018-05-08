package com.alibaba.study.spi.impl;

import com.alibaba.study.spi.HelloInterface;

public class TextHello implements HelloInterface{

    @Override
    public void sayHello() {
        System.out.println("text hello");
    }
}
