package com.hin.strategy;

/**
 * ����Ĳ���ʵ�� 
 * ��˼���
 * @author Administrator
 *
 */
public class Multiply extends AbstractCalculator implements ICalculator {  
	  
    @Override  
    public int calculate(String exp) {  
        int arrayInt[] = split(exp,"\\*");  
        return arrayInt[0]*arrayInt[1];  
    }  
}