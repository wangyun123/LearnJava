package com.iotek.observer;
/*
 * 设计模式 - 观察者模式
 * 来源：iotek Android开发零基础 Java编程全套课程精讲
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject();
		
		ConcreteObserver01 observer01 = new ConcreteObserver01();
		ConcreteObserver02 observer02 = new ConcreteObserver02();
		subject.registerObserver(observer01);
		subject.registerObserver(observer02);
		// 主体通知所有观察者
		System.out.println("主体通知所有观察者:");
		subject.notifyObserver();
	}

}
