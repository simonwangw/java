package com.hin.composite;

/**
 * ������б�ʾҶ�ڵ����Ҷ�ڵ�û���ӽڵ�
 * @author Administrator
 *
 */
public class Leaf extends Component{
 
	// Ҷ�ӽڵ㲻�߱���ӵ����������Բ�ʵ��  
    @Override  
    public void add(Component c) {  
        System.out.println("");  
    }  

    // Ҷ�ӽڵ㲻�߱���ӵ�������ȻҲ����ʵ��
    @Override  
    public void remove(Component c) {   
        System.out.println("");  
    }  

    // Ҷ�ӽڵ�û���ӽڵ�������ʾ�Լ���ִ�н��  
    @Override  
    public void eachChild() {  
        System.out.println(name + "ִ����");  
    }  
}
