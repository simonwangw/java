package com.hin.composite;

/**
 * ���ģʽ�Ĳ���
 * ��������ϳ����νṹ�Ա�ʾ"����-����"�Ĳ�νṹ��"Composite"ʹ���û��Ե����������϶����ʹ�þ���һ����
 * @author Administrator
 * 2014/08/06
 */
public class Test {

	public static void main(String[] args) { 
        // ������ڵ�  
        Composite rootComposite = new Composite();  
        rootComposite.name = "���ڵ�";  
  
        // ��ڵ�  
        Composite compositeLeft = new Composite();  
        compositeLeft.name = "��ڵ�";  
  
        // �����ҽڵ㣬�������Ҷ�Ӽ��㣬Ҳ�����Ӳ���  
        Composite compositeRight = new Composite();  
        compositeRight.name = "�ҽڵ�";  
        Leaf leaf1 = new Leaf();  
        leaf1.name = "��-�ӽڵ�1";  
        Leaf leaf2 = new Leaf();  
        leaf2.name = "��-�ӽڵ�2";  
        compositeRight.add(leaf1);  
        compositeRight.add(leaf2);  
  
        // ���ҽڵ���� ���ڵ�  
        rootComposite.add(compositeRight);  
        rootComposite.add(compositeLeft);  
        // ������ϲ���  
        rootComposite.eachChild(); 
	}
}
