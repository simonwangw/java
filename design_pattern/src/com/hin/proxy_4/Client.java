package com.hin.proxy_4;

/**
 * ��̬����ģʽ�Ĳ���_4 (���Զ�����Ķ�������Ľӿڷ�����ʵ������Ĵ���)
 * (Ŀǰֻ��ʵ��һ�������û��ɵ��ӵĴ���)
 * ���ھ�̬�����У����������Ҫд�����ģ����ڶ�̬�����У�����֪�������������֣�Ҫ���Ǹ��������ֱ�Ӱ��������
 * @author Administrator
 * 2014/07/13
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();  // ���������
		InvocationHandler h = new TimeHandler(t);  // ʱ���ϵĴ���
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class, h);
		m.move();
	}
}