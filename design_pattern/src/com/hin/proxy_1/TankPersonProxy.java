package com.hin.proxy_1;

/**
 * ̹���˴�����
 * @author Administrator
 *
 */
public class TankPersonProxy implements Moveable{

	Moveable v;  // �ۺ�
	
	public TankPersonProxy(Moveable v){
		this.v = v;
	}
	
	@Override
	public void move() {
		System.out.println("̹������������...");
		v.move();
		System.out.println("̹������������...");
	}
}
