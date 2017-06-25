package com.hin.builder;

/**
 * ָ����
 * ��ָ�������������ߣ��û�����ָ������ϵ�ģ�ָ������ϵ���������õ���Ʒ
 * @author Administrator
 *
 */
public class Director {
	
	private Builder builder; 
	
	public Director( Builder builder ) { 
		this.builder = builder; 
	} 
	
	public void construct() { 
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC(); 
	} 
}
