package com.hin.interpreter;

/**
 * �����ɫ������һ������������ķ��и����ս������Ӧ�ľ���ֵ������R=R1+R2�����Ǹ�R1��ֵ100����R2��ֵ200
 * @author Administrator
 *
 */
public class Context {  
    
    private int num1;  
    private int num2;  
      
    public Context(int num1, int num2) {  
        this.num1 = num1;  
        this.num2 = num2;  
    }  
      
    public int getNum1() {  
        return num1;  
    }  
    public void setNum1(int num1) {  
        this.num1 = num1;  
    }  
    public int getNum2() {  
        return num2;  
    }  
    public void setNum2(int num2) {  
        this.num2 = num2;  
    }  
      
      
}
