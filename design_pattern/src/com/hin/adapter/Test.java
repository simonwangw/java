package com.hin.adapter;

/**
 * ������ģʽ�Ĳ���
 * ����˼����ǣ���һ��Adapee�࣬ӵ��һ�������������䣬Ŀ��ӿ���Target��ͨ��Adapter�࣬��Adapee�Ĺ�����չ��Target��
 * ��Ҫ��Ϊ���ࣺ���������ģʽ�������������ģʽ���ӿڵ�������ģʽ
 * @author Administrator
 * 2014/07/09
 */
public class Test {

	public static void main(String[] args) {
		Target target = new Adapter();  
        target.method1();  
        target.method2();
	}
}
