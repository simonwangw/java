package com.hin.strategy;

/**
 * ����Ĳ���ʵ�� 
 * ��Ӽ���
 * @author Administrator
 *
 */
public class Plus extends AbstractCalculator implements ICalculator {  
	  
    @Override  
    public int calculate(String exp) {  
        int arrayInt[] = split(exp,"\\+");  
        return arrayInt[0]+arrayInt[1];  
    }  
} 