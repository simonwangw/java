package com.hin.observer;

/**
 * �����󣨱��۲�Ķ���
 * ���й�״̬�������۲��߶��󣬵��ö���ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ
 * @author Administrator
 *
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}
