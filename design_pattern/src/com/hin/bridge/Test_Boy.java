package com.hin.bridge;

/**
 * �Ž�ģʽ�Ĳ���
 * @author Administrator
 * 2014/07/09
 */
public class Test_Boy {
	
	public void pursue(MM mm){
		Gift gift = new WarmGift(new Flower());  // �����ǡ���ů�Ļ���
		give(gift, mm);
	}
	
	public void give(Gift g, MM mm){}
}
