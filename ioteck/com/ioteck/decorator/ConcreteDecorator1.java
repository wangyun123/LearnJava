package com.ioteck.decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
		doSomethingA();
	}

	private void doSomethingA() {
		System.out.println("ConcreteDecorator1 do something A!");
	}
}
