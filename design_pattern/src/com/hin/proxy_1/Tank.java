package com.hin.proxy_1;

/**
 * 被代理类
 * @author Administrator
 *
 */
public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.println("坦克正在开了...");
	}
}
