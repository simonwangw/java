package com.hin.visitor;

/**
 * ���������
 * ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣������㷨Ƭ����Ӧ���ڽṹ�ж������
 * @author Administrator
 *
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("��๤A��ɹ�԰A���ֵ�����");
	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub

	}

}
