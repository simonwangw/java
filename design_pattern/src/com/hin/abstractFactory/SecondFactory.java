package com.hin.abstractFactory;

/**
 * �ڶ������幤��
 * �൱��ConcreteFactory1
 * �������ɻ����͡�ˮ��
 * @author Administrator
 *
 */
public class SecondFactory extends AbstractFactory{

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}

	@Override
	public Food createFood() {
		return new water();
	}

}
