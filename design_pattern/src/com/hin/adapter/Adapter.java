package com.hin.adapter;

/**
 * 适配器类是本模式的核心；适配器把源接口转换成目标接口
 * @author Administrator
 *
 */
public class Adapter extends Adapee implements Target{

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
		
	}
}
