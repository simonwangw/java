package com.hin.singleton;

/**
 * ����ģʽ�Ĳ���
 * @author Administrator
 * 2014/07/04
 */
public class Test {

	public static void main(String[] args) {
		Car car = Car.getInstance();  // �þ�̬��������һ����(����)
		Car car2 = Car.getInstance();
		
		// �����ǲ���ͬһ��ʵ��
		if (car==car2) {
			System.out.println("����һ����");
		}else {
			System.out.println("���ǲ�һ����");
		}
		
	}
}
