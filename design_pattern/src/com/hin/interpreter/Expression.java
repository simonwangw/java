package com.hin.interpreter;

/**
 * ������ʽ(Expression)��ɫ������һ�����еľ�����ʽ��ɫ����Ҫʵ�ֵĳ���ӿ�
 * ����ӿ���Ҫ��һ��interpret()�������������Ͳ���
 * @author Administrator
 *
 */
public interface Expression {  
    public int interpret(Context context);  
} 
