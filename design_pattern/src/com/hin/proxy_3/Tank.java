package com.hin.proxy_3;

import java.util.Random;

/**
 * 被代理类
 * @author Administrator
 *
 */
public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}	
}