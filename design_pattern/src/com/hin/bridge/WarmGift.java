package com.hin.bridge;

/**
 * ����ʲô���͵�����
 * �൱��RefinedAbstraction
 * @author Administrator
 *
 */
public class WarmGift extends Gift{

	public WarmGift(GiftImpl giftImpl){
		this.giftImpl = giftImpl;  // this.giftImpl����Gift���ж����
	}
}
