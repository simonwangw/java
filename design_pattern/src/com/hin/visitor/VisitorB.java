package com.hin.visitor;

/**
 * 具体访问者
 * 实现每个由Visitor声明的操作，每个操作实现算法的一部分，而该算法片段是应对于结构中对象的类
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
		System.out.println("清洁工B完成公园B部分的卫生");
	}

}
