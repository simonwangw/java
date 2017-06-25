package com.hin.factory;

/**
 * 汽车工厂类，用于生产汽车
 * 相当于ConcreteCreator
 * @author Administrator
 *
 */
public class CarFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Car();
	}
}
