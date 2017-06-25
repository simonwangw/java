package com.hin.state;

/**
 * 具体状态类，每一个子类实现一个与Person的一个状态相关的行为
 * @author Administrator
 *
 */
public class HappyState extends State{

	@Override
	public void smile() {
		System.out.println("高兴的笑...");
	}

	@Override
	public void cry() {
		System.out.println("高兴的哭...");
	}

	@Override
	public void say() {
		System.out.println("高兴的说...");
	}
}
