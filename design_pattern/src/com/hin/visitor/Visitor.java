package com.hin.visitor;

/**
 * ������
 * Ϊ�ö���ṹ��ConcreteElement��ÿһ����(����ָPark,ParkA,ParkB)����һ��Visitor����
 * @author Administrator
 *
 */
public interface Visitor {

	public void visit(Park park);
	public void visit(ParkA parkA);
	public void visit(ParkB parkB);
}
