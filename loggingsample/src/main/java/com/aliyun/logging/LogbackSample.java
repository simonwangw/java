package com.aliyun.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackSample {

    private static Logger logger = LoggerFactory.getLogger(LogbackSample.class);

    public static void main(String[] args) {

        int i = 0;
        while( i++ < 120) {
            logger.info("hello alibaba from logback");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
