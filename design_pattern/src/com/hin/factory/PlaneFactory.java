package com.hin.factory;

/**
 * �ɻ������࣬���������ɻ�
 * �൱��ConcreteCreator
 * @author Administrator
 *
 */
public class PlaneFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Plane();
	}
}
