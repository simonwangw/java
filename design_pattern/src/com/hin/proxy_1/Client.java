package com.hin.proxy_1;

/**
 * ����ģʽ����̬�����Ĳ���
 * @author Administrator
 * 2014/07/10
 */
public class Client {

	public static void main(String[] args) {
		Moveable m = new Tank();
		TankTimeProxy tp = new TankTimeProxy(m);
		//TankPersonProxy pp = new TankPersonProxy(tp);
		tp.move();
	}
}
