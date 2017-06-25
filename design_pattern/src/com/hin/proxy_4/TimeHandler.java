package com.hin.proxy_4;

import java.lang.reflect.Method;

/**
 * ʱ�䴦����
 * ���ڱ�������󷽷�ִ��ǰ�����ʱ�䣩
 * @author Administrator
 *
 */
public class TimeHandler implements InvocationHandler{
	
	private Object target;  // Ŀ����󣨱��������

	// ͨ�����췽�������������뱻�������
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method m) {
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		System.out.println(o.getClass().getName());
		try {
			m.invoke(target);  // ���ñ���������M����
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}
}
