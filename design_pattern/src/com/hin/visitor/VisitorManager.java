package com.hin.visitor;

/**
 * ���������
 * ʵ��ÿ����Visitor�����Ĳ�����ÿ������ʵ���㷨��һ���֣������㷨Ƭ����Ӧ���ڽṹ�ж������
 * @author Administrator
 *
 */
public class VisitorManager implements Visitor {

	@Override
	public void visit(Park park) {
		System.out.println("����Ա����԰�������");
	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("����Ա����԰A�����������");
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("����Ա����԰B�����������");
	}

}
