package com.hin.state;

/**
 * ά��һ��State�����ʵ�������ʵ�����嵱ǰ��״̬
 * @author Administrator
 *
 */
public class Person {

	private State state = new HappyState();  // ״̬
	
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
