package com.hin.visitor;

/**
 * ���������
 * ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣������㷨Ƭ����Ӧ���ڽṹ�ж������
 * @author Administrator
 *
 */
public class VisitorB implements Visitor {

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("��๤B��ɹ�԰B���ֵ�����");
	}

}
