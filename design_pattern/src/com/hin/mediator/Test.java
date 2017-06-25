package com.hin.mediator;

/**
 * 中介者模式的测试
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