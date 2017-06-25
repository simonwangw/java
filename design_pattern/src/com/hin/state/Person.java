package com.hin.state;

/**
 * 维护一个State子类的实例，这个实例定义当前的状态
 * @author Administrator
 *
 */
public class Person {

	private State state = new HappyState();  // 状态
	
	public void smile(){
		state.smile();
	}
	
	public void cry(){
		state.cry();
	}

	public void say(){
		state.say();
	}
}
