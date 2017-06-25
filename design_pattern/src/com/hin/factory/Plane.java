package com.hin.factory;

/**
 * 相当于ConcreteProduct
 * @author Administrator
 *
 */
public class Plane implements Moveable{
	
	public Plane(){};

	@Override
	public void run() {
		System.out.println("开飞机...");
	}
}
