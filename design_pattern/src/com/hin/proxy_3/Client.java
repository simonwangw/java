package com.hin.proxy_3;

/**
 * ��̬����ģʽ�Ĳ���_3 (����������ӿڵĴ������)
 * ���ھ�̬�����У����������Ҫд�����ģ����ڶ�̬�����У�����֪�������������֣�Ҫ���Ǹ��������ֱ�Ӱ��������
 * @author Administrator
 * 2014/07/12
 */
public class Client {
	public static void main(String[] args) throws Exception {
		//Tank t = new Tank();
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class);
		m.move();
	}
}