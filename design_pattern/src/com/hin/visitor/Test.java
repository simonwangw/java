package com.hin.visitor;

/**
 * ������ģʽ�Ĳ���
 * ������ģʽ�����������ݺ���Ϊ������ʵ�ֲ��޸������������£������µĲ���
 * @author Administrator
 * 2014/08/07
 */
public class Test {

	public static void main(String[] args) {
		Park park = new Park();
		
		VisitorA visitorA = new VisitorA();
		park.accept(visitorA);
		
		VisitorB visitorB = new VisitorB();
		park.accept(visitorB);
		
		VisitorManager visitorManager = new VisitorManager();
		park.accept(visitorManager);
	}

}
