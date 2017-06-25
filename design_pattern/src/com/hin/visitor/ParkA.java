package com.hin.visitor;

/**
 * 公园的A部分
 * @author Administrator
 *
 */
public class ParkA implements ParkElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
