package com.hin.memento;

/**
 * ����¼ģʽ�Ĳ���
 * @author Administrator
 * 2014/08/07
 */
public class Test {  
	  
    public static void main(String[] args) {  
          
        // ����ԭʼ��  
        Original origi = new Original("egg");  
        // ��������¼  
        Storage storage = new Storage(origi.createMemento());  // egg����������
        // �޸�ԭʼ���״̬  
        System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());  
        // �ظ�ԭʼ���״̬  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("�ָ����״̬Ϊ��" + origi.getValue());  
    }  
}