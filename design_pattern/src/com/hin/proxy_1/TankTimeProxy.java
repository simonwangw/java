package com.hin.proxy_1;

/**
 * 坦克时间代理类
 * @author Administrator
 *
 */
public class TankTimeProxy implements Moveable{

	Moveable v;  // 聚合
	
	public TankTimeProxy(Moveable v){
		this.v = v;
	}
	
	@Override
	public void move() {
		System.out.println("坦克准备开了...");
		v.move();
		System.out.println("坦克停下来了...");
	}

}
