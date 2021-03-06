package com.hin.memento;

/**
 * 备忘录模式的测试
 * @author Administrator
 * 2014/08/07
 */
public class Test {  
	  
    public static void main(String[] args) {  
          
        // 创建原始类  
        Original origi = new Original("egg");  
        // 创建备忘录  
        Storage storage = new Storage(origi.createMemento());  // egg被保存起来
        // 修改原始类的状态  
        System.out.println("初始化状态为：" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("修改后的状态为：" + origi.getValue());  
        // 回复原始类的状态  
        origi.restoreMemento(storage.getMemento());  
        System.out.println("恢复后的状态为：" + origi.getValue());  
    }  
}