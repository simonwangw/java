package com.hin.interpreter;

/**
 * �ս�����ʽ(Terminal Expression)��ɫ
 * @author Administrator
 *
 */
public class Minus implements Expression {  
	  
    @Override  
    public int interpret(Context context) {  
        return context.getNum1()-context.getNum2();  
    }  
} 