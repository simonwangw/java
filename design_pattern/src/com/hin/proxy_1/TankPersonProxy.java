package com.hin.proxy_1;

/**
 * 坦克人代理类
 * @author Administrator
 *
 */
public class TankPersonProxy implements Moveable{

	Moveable v;  // 聚合
	
	public TankPersonProxy(Moveable v){
		this.v = v;
	}
	
	@Override
	public void move() {
		System.out.println("坦克里有人上了...");
		v.move();
		System.out.println("坦克里有人下了...");
	}
}
