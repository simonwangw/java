package com.hin.visitor;

/**
 * ��԰��A����
 * @author Administrator
 *
 */
public class ParkA implements ParkElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
