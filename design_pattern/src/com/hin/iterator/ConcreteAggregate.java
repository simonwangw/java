package com.hin.iterator;

/**
 * ����ۼ���
 * @author Administrator
 *
 */
public class ConcreteAggregate implements Aggregate {  
	  
    public String string[] = {"A","B","C","D","E"};  
    @Override  
    public Iterator CreateIterator() {  
        return new ConcreteIterator(this);  // �����鴫��
    }  
  
    @Override  
    public Object get(int i) {  
        return string[i];  
    }  
  
    @Override  
    public int size() {  
        return string.length;  
    }  
}