package com.hin.decorator;

/**
 * װ��ģʽ�Ĳ���
 * װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * 
 * װ����ģʽ��ע����һ�������϶�̬����ӷ�����Ȼ������ģʽ��ע�ڿ��ƶԶ���ķ��ʣ�
 * �ô���ģʽ�������ࣨproxy class�����Զ����Ŀͻ�����һ������ľ�����Ϣ����ˣ���ʹ�ô���ģʽ��ʱ�����ǳ�����һ���������д���һ�������ʵ����
 * ʹ��װ����ģʽ��ʱ������ͨ���������ǽ�ԭʼ������Ϊһ����������װ���ߵĹ�����
 * 
 * @author Administrator
 * 2014/07/23
 */
public class Test {

	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		Component concreteDecoratorA = new ConcreteDecoratorA(c);
		concreteDecoratorA.operation();
	}
}
