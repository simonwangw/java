package com.hin.visitor;

/**
 * ��԰��B����
 * @author Administrator
 *
 */
public class ParkB implements ParkElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
