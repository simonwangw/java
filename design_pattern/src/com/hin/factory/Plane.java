package com.hin.factory;

/**
 * �൱��ConcreteProduct
 * @author Administrator
 *
 */
public class Plane implements Moveable{
	
	public Plane(){};

	@Override
	public void run() {
		System.out.println("���ɻ�...");
	}
}
