package com.hin.state;

/**
 * ����״̬�࣬ÿһ������ʵ��һ����Person��һ��״̬��ص���Ϊ
 * @author Administrator
 *
 */
public class HappyState extends State{

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
