package com.hin.templateMethod;

/**
 * ģ�巽���Ĳ���
 * ʵ�� ���Ѿ����ض������㷨�е�ĳЩ��Ҫ�Ĵ���ί�ø����󷽷���ͨ������̳жԳ��󷽷��Ĳ�ͬʵ�ָı������㷨����Ϊ
 * @author Administrator
 * 2014/07/14
 */
public class Test {

	public static void main(String[] args) {
		MakeVehicle v = new MakeBus();
		v.Make();
		System.out.println("***********");
		v = new MakeCar();
		v.Make();
	}
}
