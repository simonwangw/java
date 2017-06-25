package com.hin.visitor;

/**
 * 公园的B部分
 * @author Administrator
 *
 */
public class ParkB implements ParkElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
