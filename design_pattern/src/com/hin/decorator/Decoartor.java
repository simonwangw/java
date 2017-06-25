package com.hin.decorator;

/**
 * װ����
 * ����������չComponent��Ĺ���
 * @author Administrator
 *
 */
public class Decoartor implements Component {

	private Component component;
	
	public Decoartor(Component component){
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}

}
