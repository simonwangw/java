package com.hin.singleton;

/**
 * ������
 * ֻ����һ������
 * ����һ��getInstance������ֻ�����������Ψһʵ��
 * @author Administrator
 *
 */
public class Car {
	
	// ��̬����Ϊ˽�еģ�����ֱ��������new
	private Car(){}
	
	private static Car car = new Car();  // ����
	
	// private static List<Car> cars = new ArrayList<Car>();  // ����(��һ���������ж�����)
	
	/**
	 * ��̬����
	 * @return
	 */
	public static Car getInstance(){
		return car;
	}
}
