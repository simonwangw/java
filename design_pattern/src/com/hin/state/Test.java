package com.hin.state;

/**
 * 状态模式的测试
 * 根据不同的状态执行不同的动作
 * @author Administrator
 * 2014/07/16
 */
public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.smile();
		p.say();
		p.cry();
	}

}
