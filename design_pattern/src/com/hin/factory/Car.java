package com.hin.factory;

/**
 * �൱��ConcreteProduct
 * @author Administrator
 *
 */
public class Car implements Moveable{
	
	public Car(){}

	@Override
	public void run(){
		System.out.println("����...");
	}
}
