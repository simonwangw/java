package com.hin.proxy_1;

/**
 * ̹��ʱ�������
 * @author Administrator
 *
 */
public class TankTimeProxy implements Moveable{

	Moveable v;  // �ۺ�
	
	public TankTimeProxy(Moveable v){
		this.v = v;
	}
	
	@Override
	public void move() {
		System.out.println("̹��׼������...");
		v.move();
		System.out.println("̹��ͣ������...");
	}

}
