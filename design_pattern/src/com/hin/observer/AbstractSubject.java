package com.hin.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * �����ж���۲��߶�������ñ�����һ�������У��������ӻ�ɾ���۲��߶���
 * @author Administrator
 *
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}
}
