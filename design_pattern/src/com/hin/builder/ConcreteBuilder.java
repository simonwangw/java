package com.hin.builder;

/**
 * ���彨���ߣ������װ���������
 * @author Administrator
 *
 */
public class ConcreteBuilder implements Builder {

	Part partA, partB, partC;
	
	@Override
	public void buildPartA() {
		// �����Ǿ�����ι���partA�Ĵ���
	}

	@Override
	public void buildPartB() {
		// �����Ǿ�����ι���partB�Ĵ���
	}

	@Override
	public void buildPartC() {
		// �����Ǿ�����ι���partC�Ĵ���
	}

	@Override
	public Product getResult() {
		// ���������װ��Ʒ���
		return null;
	}

}
