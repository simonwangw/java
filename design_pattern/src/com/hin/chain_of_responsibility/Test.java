package com.hin.chain_of_responsibility;

/**
 * 责任链模式的测试
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这些对象连成一条链；
 * 并沿着这条链传递该请求，直到有一个对象处理它为止
 * @author Administrator
 * 2014/07/27
 */
public class Test {

	public static void main(String[] args) {
		//组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
	}
}
