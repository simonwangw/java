package com.hin.factory;

/**
 * ��̬����ģʽ����ͨ�������Ĳ���
 * ʵ�� �����ⶨ�ƽ�ͨ�������ͺ���������
 * @author Administrator
 * 2014/07/04
 */
public class Test {

	public static void main(String[] args) {
		Moveable moveable = new CarFactory().create();  // ��������������һ��ͨ����(����)
		moveable.run();
		
		Moveable moveable2 = new PlaneFactory().create();  // �÷ɻ���������һ��ͨ����(����)
		moveable2.run();
	}
}
