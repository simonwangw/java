package com.hin.builder;

/**
 * Builder��Ϊ����һ��Product����ĸ�������ָ���ĳ���ӿ�
 * @author Administrator
 *
 */
public interface Builder { 
	
	void buildPartA(); 
	void buildPartB(); 
	void buildPartC(); 

	Product getResult(); 
}
