package com.hin.templateMethod;

public class MakeBus extends MakeVehicle{

	// method1
	@Override
	public void makeHead() {
		System.out.println("Bus:��װ��ͷ");
	}

	// method2
	@Override
	public void makeBody() {
		System.out.println("Bus:��װ����");
	}

	// method3
	@Override
	public void makeFoot() {
		System.out.println("Bus:��װ��β");
	}
}
