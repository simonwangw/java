package com.hin.memento;

/**
 * ����¼��
 * ����洢Original������ڲ�״̬�����ɷ�ֹOriginal����Ķ�����ʱ���¼Memento
 * @author Administrator
 *
 */
public class Memento {  
    
    private String value;  
  
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}
