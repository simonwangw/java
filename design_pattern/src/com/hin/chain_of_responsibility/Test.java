package com.hin.chain_of_responsibility;

/**
 * ������ģʽ�Ĳ���
 * ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ϲ�ϵ������Щ��������һ������
 * ���������������ݸ�����ֱ����һ����������Ϊֹ
 * @author Administrator
 * 2014/07/27
 */
public class Test {

	public static void main(String[] args) {
		//��װ������
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //�ύ����
        handler1.handleRequest();
	}
}
