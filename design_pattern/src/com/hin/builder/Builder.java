package com.hin.builder;

/**
 * Builder是为创建一个Product对象的各个部件指定的抽象接口
 * @author Administrator
 *
 */
public interface Builder { 
	
	void buildPartA(); 
	void buildPartB(); 
	void buildPartC(); 

	Product getResult(); 
}
