package com.hin.observer;

/**
 * �۲���ģʽ�Ĳ���
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯
 * @author Administrator
 * 2014/07/23
 */
public class Test {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}

}
