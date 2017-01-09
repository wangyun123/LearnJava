package com.ioteck.decorator;

/*
 * 设计模式 - 装饰模式
 * 来源：iotek Android开发零基础 Java编程全套课程精讲
 */

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component = new ConcreteComponent();
		ConcreteDecorator1 decorator1 = new ConcreteDecorator1(component);
		decorator1.doSomething();
		
		ConcreteDecorator2 decorator2 = new ConcreteDecorator2(decorator1);
		decorator2.doSomething();
	}

}
