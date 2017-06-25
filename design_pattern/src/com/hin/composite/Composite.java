package com.hin.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * �������ӽڵ����Ϊ�������洢�Ӳ�������Component�ӿ���ʵ�����Ӳ����йصĲ���
 * @author Administrator
 *
 */
public class Composite extends Component{
 
	// ��������ڵ���ӽڵ�  
    List<Component> list = new ArrayList<Component>();  

    // ��ӽڵ� ��Ӳ���  
    @Override  
    public void add(Component c) {  
        list.add(c);  
    }  

    // ɾ���ڵ� ɾ������  
    @Override  
    public void remove(Component c) {   
        list.remove(c);  
    }  

    // �����ӽڵ�  
    @Override  
    public void eachChild() {    
        System.out.println(name + "ִ����");  
        for (Component c : list) {  
            c.eachChild();  
        }  
    }  
}