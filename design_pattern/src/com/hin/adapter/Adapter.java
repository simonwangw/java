package com.hin.adapter;

/**
 * ���������Ǳ�ģʽ�ĺ��ģ���������Դ�ӿ�ת����Ŀ��ӿ�
 * @author Administrator
 *
 */
public class Adapter extends Adapee implements Target{

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
		
	}
}
