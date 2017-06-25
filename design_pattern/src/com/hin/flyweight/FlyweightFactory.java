package com.hin.flyweight;

import java.util.Hashtable;

/**
 * ��Ԫ����
 * ����������Flyweight������Ҫ������ȷ������ع���Flyweight�����û�����һ��Flyweightʱ��
 * FlyweightFactory�ṩһ���Ѵ�����ʵ�����ߴ���һ���������ڵĻ���
 * @author Administrator
 *
 */
public class FlyweightFactory {

	private Hashtable flyweights = new Hashtable();  // �����洢�������� 
	
	public FlyweightFactory(){}  
	
	public Flyweight getFlyWeight(Object obj){  
		Flyweight flyweight = (Flyweight) flyweights.get(obj);  // ѡ��Ҫʵ�����Ķ��� 
		if(flyweight == null){
			// �����µ�ConcreteFlyweight  
			flyweight = new ConcreteFlyweight((String)obj);  
			flyweights.put(obj, flyweight);
		}  
		return flyweight;  // ���ö��󷵻أ������Hashtable��û��Ҫѡ��Ķ��󣬴�ʱ����flyweightΪnull������һ���µ�flyweight�洢��Hashtable�У������ö��󷵻�
	}  
	
	public int getFlyweightSize(){  
		return flyweights.size();  
	}
}