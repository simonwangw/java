package com.hin.abstractFactory;

/**
 * ��һ�����幤��
 * �൱��ConcreteFactory1
 * �����������͡�ƻ����
 * @author Administrator
 *
 */
public class FirstFactory extends AbstractFactory{

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

	@Override
	public Food createFood() {
		return new Apple();
	}
}
