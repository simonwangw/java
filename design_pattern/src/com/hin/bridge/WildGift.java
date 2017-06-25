package com.hin.bridge;

/**
 * 具体什么类型的礼物
 * 相当于RefinedAbstraction
 * @author Administrator
 *
 */
public class WildGift extends Gift{

	public WildGift(GiftImpl giftImpl){
		this.giftImpl = giftImpl;
	}
}
