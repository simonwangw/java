package com.hin.templateMethod;

public class MakeCar extends MakeVehicle{

	// method1
	@Override
	public void makeHead() {
		System.out.println("Car:��װ��ͷ");
	}

	// method2
	@Override
	public void makeBody() {
		System.out.println("Car:��װ����");
	}

	// method3
	@Override
	public void makeFoot() {
		System.out.println("Car:��װ��β");
	}
}
