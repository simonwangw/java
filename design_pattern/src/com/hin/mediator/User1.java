package com.hin.mediator;

/**
 * ����ͬ����
 * ÿ������ͬ��ֻ֪���Լ�����Ϊ�������˽�����ͬ�µ������������ʶ�н��߶���
 * @author Administrator
 *
 */
public class User1 extends User {

	public User1(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user1 exe!");
	}
}
