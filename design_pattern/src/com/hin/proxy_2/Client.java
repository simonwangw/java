package com.hin.proxy_2;

/**
 * ��̬����ģʽ�Ĳ���_1 (ֻ�ܶ�ָ���Ķ���ָ���Ľӿڷ�����ʵ��ָ���Ĵ�����Proxy������ָ���ĽӿڵĴ������)
 * (�ھ�̬�����У����������Ҫд�����ģ����ڶ�̬�����У�����֪�������������֣�Ҫ���Ǹ��������ֱ�Ӱ������)
 * @author Administrator
 * 2014/07/11
 */
public class Client {
	public static void main(String[] args) throws Exception {
		//Tank t = new Tank();
		Moveable m = (Moveable)Proxy.newProxyInstance();
		m.move();
	}
}