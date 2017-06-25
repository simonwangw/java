package com.hin.proxy_4.test;

import java.lang.reflect.Method;

import com.hin.proxy_4.InvocationHandler;

/**
 * ��������
 * ���ڱ�������󷽷�ִ��ǰ���������ʼ���ύ��
 * @author Administrator
 *
 */
public class TransactionHandler implements InvocationHandler{

	private Object target;  // Ŀ����󣨱��������

	// ͨ�����췽�������������뱻�������
	public TransactionHandler(Object target) {
		super();
		this.target = target;
	}
	
	@Override
	public void invoke(Object o, Method m) {
		System.out.println("Transaction begin...");
		try {
			m.invoke(target);  // ���ñ���������M����
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Transaction commit...");
	}

}
