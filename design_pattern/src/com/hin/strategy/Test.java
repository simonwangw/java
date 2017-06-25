package com.hin.strategy;

/**
 * 策略模式的测试
 * 根据不同的策略执行不同的动作
 * @author Administrator
 * 2014/07/18
 */
public class Test {  
	  
    public static void main(String[] args) {  
        String exp = "2+8";  
        ICalculator cal = new Plus();  // 相加策略
        int result = cal.calculate(exp);  
        System.out.println(result);
    }  
}