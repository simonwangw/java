package com.hin.bridge;

/**
 * 具体什么类型的礼物
 * 相当于RefinedAbstraction
 * @author Administrator
 *
 */
public class WarmGift extends Gift{

	public WarmGift(GiftImpl giftImpl){
		this.giftImpl = giftImpl;  // this.giftImpl是在Gift类中定义的
	}
}
