package com.hin.proxy_4;

import java.lang.reflect.Method;

/**
 * �������ӿ�
 * @author Administrator
 *
 */
public interface InvocationHandler {
	
	/**
	 * 
	 * @param o  �������
	 * @param m  
	 */
	public void invoke(Object o, Method m);
}
