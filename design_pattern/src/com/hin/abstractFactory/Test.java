package com.hin.abstractFactory;

/**
 * ���󹤳�ģʽ�Ĳ���
 * ϵ�в�Ʒ����ͨ���ߣ�ʳ��...��
 * @author Administrator
 * 2014/07/07
 */
public class Test {
	public static void main(String[] args) {
		AbstractFactory f = new SecondFactory();
		f.createVehicle().run();
		f.createFood().eat();
	}
}