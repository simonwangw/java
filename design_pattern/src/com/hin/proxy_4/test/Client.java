package com.hin.proxy_4.test;

import com.hin.proxy_4.InvocationHandler;
import com.hin.proxy_4.Proxy;
import com.hin.proxy_4.TimeHandler;

/**
 * ��̬����ģʽ�Ĳ���_4 (���Զ�����Ķ�������Ľӿڷ�����ʵ������Ĵ���)
 * (Ŀǰֻ��ʵ��һ�������û��ɵ��ӵĴ���)
 * ���ھ�̬�����У����������Ҫд�����ģ����ڶ�̬�����У�����֪�������������֣�Ҫ���Ǹ��������ֱ�Ӱ��������
 * @author Administrator
 * 2014/07/13
 */
public class Client {
	public static void main(String[] args) throws Exception {
		UserMgr mgr = new UserMgrImpl();  // ���������
		InvocationHandler h = new TransactionHandler(mgr);  // �����ϵĴ���
		//InvocationHandler h = new TimeHandler(mgr);  // ʱ���ϵĴ���
		UserMgr u = (UserMgr)Proxy.newProxyInstance(UserMgr.class, h);
		u.addUser();
		
//      ���ɵ�$proxy1.java��com.hin.proxy_4����		
	}
}
