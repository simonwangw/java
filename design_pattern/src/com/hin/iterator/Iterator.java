package com.hin.iterator;

/**
 * �������ӿ�
 * @author Administrator
 *
 */
public interface Iterator {  
    //ǰ��  
    public Object previous();      
    //����  
    public Object next();  
    
    public boolean hasNext();     
    //ȡ�õ�һ��Ԫ��  
    public Object first();  
}
