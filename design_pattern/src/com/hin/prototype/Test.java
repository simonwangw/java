package com.hin.prototype;

/**
 * ԭ��ģʽ�Ĳ���
 * ��һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * @author Administrator
 * 2014/08/05
 */
public class Test {
 
     public static void main(String[] args) {
         Prototype pro = new ConcretePrototype("prototype");
         Prototype pro2 = (Prototype)pro.clone();
         System.out.println(pro.getName());
         System.out.println(pro2.getName());
     }
}