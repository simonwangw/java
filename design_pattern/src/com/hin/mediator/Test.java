package com.hin.mediator;

/**
 * �н���ģʽ�Ĳ���
 * @author Administrator
 * 2014/07/16
 */
public class Test {

	public static void main(String[] args) {
		Mediator mediator = new MyMediator();
		mediator.createMediator();
		mediator.workAll();
	}
}