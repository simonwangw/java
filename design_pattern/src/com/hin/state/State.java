package com.hin.state;

/**
 * 状态抽象类，封装与Person的一个特定状态相关的行为
 * @author Administrator
 *
 */
public abstract class State {
	
	public abstract void smile();
	
	public abstract void cry();
	
	public abstract void say();
	
}
