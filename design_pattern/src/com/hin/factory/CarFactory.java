package com.hin.factory;

/**
 * ���������࣬������������
 * �൱��ConcreteCreator
 * @author Administrator
 *
 */
public class CarFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Car();
	}
}
