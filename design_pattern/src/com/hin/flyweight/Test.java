package com.hin.flyweight;

/**
 * ��Ԫģʽ�Ĳ���
 * ��ҪĿ����ʵ�ֶ���Ĺ���������أ���ϵͳ�ж�����ʱ����Լ����ڴ�Ŀ���
 * @author Administrator
 * 2014/08/08
 */
public class Test {

	FlyweightFactory factory = new FlyweightFactory();   
	Flyweight fly1;  
	Flyweight fly2;  
	Flyweight fly3;    

	public Test(){  
		fly1 = factory.getFlyWeight("obj1");  
		fly2 = factory.getFlyWeight("obj2");  
		fly3 = factory.getFlyWeight("obj1");    
	}  
	
	public void showFlyweight(){  
		fly1.operation();  
		fly2.operation();  
		fly3.operation();   
		int objSize = factory.getFlyweightSize();  
		System.out.println("objSize = " + objSize);  
	}  
	
	public static void main(String[] args){   
		/*
		 * ������3������������2������ͬ�ģ�������Ԫģʽ�Ķ��塰obj1��Ӧ�ù���һ������
		 * ��ʵ�ʵĶ����������ǿ��Կ���ʵ�ʵĶ���ȴ��ֻ��2��
		 */
		Test test = new Test();  
		test.showFlyweight();  
	}
}