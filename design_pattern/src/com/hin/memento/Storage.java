package com.hin.memento;

/**
 * Storage���Ǵ洢����¼���࣬����Memento���ʵ�������𱣴�ñ���¼
 * @author Administrator
 *
 */
public class Storage {  
    
    private Memento memento;  
      
    public Storage(Memento memento) {  
        this.memento = memento;  
    }  
  
    public Memento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(Memento memento) {  
        this.memento = memento;  
    }  
} 