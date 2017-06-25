package com.hin.memento;

/**
 * Original����ԭʼ�࣬��������Ҫ���������value
 * ���𴴽�һ������¼�����Լ�¼��ǰʱ�������ڲ�״̬������ʹ�ñ���¼�ָ��ڲ�״̬
 * @author Administrator
 *
 */
public class Original {  
    
    private String value;  
      
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
  
    public Original(String value) {  
        this.value = value;  
    }  
  
    // ��������¼�࣬����value��ֵ 
    public Memento createMemento(){  
        return new Memento(value);  
    }  
      
    // ʹ�ñ���¼�ָ�value
    public void restoreMemento(Memento memento){  
        this.value = memento.getValue();  
    }  
}
