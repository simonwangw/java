package com.hin.factory;

/**
 * 相当于ConcreteProduct
 * @author Administrator
 *
 */
public class Car implements Moveable{
	
	public Car(){}

	@Override
	public void run(){
		System.out.println("开车...");
	}
}
