package com.hin.flyweight;

/**
 * �̳�Flyweight���࣬��Ϊ�ڲ�״̬���Ӵ洢�ռ�
 * @author Administrator
 *
 */
public class ConcreteFlyweight extends Flyweight {
	
	private String string;  
	public ConcreteFlyweight(String str){  
		string = str;  
	}

	@Override
	public void operation() {
		System.out.println("ConcreteFlyweight : " + string);
	}
}