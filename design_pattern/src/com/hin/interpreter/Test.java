package com.hin.interpreter;

/**
 * ������ģʽ�Ĳ���
 * ����һ������֮�󣬽�����ģʽ���Զ�������ķ���һ�ֱ�ʾ����ͬʱ�ṩһ�����������ͻ��˿���ʹ�������������������������еľ���
 * @author Administrator
 * 2014/08/08
 */
public class Test {  
	  
    public static void main(String[] args) {  
  
        // ����9+2-8��ֵ  
        int result = new Minus().interpret((new Context(new Plus()  
                .interpret(new Context(9, 2)), 8)));  
        System.out.println(result);  
    }  
} 
