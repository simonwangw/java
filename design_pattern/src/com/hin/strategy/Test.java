package com.hin.strategy;

/**
 * ����ģʽ�Ĳ���
 * ���ݲ�ͬ�Ĳ���ִ�в�ͬ�Ķ���
 * @author Administrator
 * 2014/07/18
 */
public class Test {  
	  
    public static void main(String[] args) {  
        String exp = "2+8";  
        ICalculator cal = new Plus();  // ��Ӳ���
        int result = cal.calculate(exp);  
        System.out.println(result);
    }  
}