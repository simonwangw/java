package com.hin.iterator;

/**
 * �ۼ��ӿ�
 * @author Administrator
 *
 */
public interface Aggregate {  
    
    public Iterator CreateIterator();  
      
    /*ȡ�ü���Ԫ��*/  
    public Object get(int i);  
      
    /*ȡ�ü��ϴ�С*/  
    public int size();  
} 
