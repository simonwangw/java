package com.hin.state;

/**
 * ����״̬�࣬ÿһ������ʵ��һ����Person��һ��״̬��ص���Ϊ
 * @author Administrator
 *
 */
public class BadState extends State{

	@Override
	public void smile() {
		System.out.println("���˵�Ц...");
	}

	@Override
	public void cry() {
		System.out.println("���˵Ŀ�...");
	}

	@Override
	public void say() {
		System.out.println("���˵�˵...");
	}

}
