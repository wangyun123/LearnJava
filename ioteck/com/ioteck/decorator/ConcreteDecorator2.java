package com.ioteck.decorator;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
		doSomethingB();
	}

	private void doSomethingB() {
		System.out.println("ConcreteComponent2 do something B!");
	}
}
