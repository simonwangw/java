package com.hin.decorator;

/**
 * �����װ�ζ��󣬸�Component��ӷ��������ԵĹ��ܣ�ͨ��Decorator�ĵ���
 * @author Administrator
 *
 */
public class ConcreteDecoratorA extends Decoartor {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("A operation...");
		super.operation();
	}
}
