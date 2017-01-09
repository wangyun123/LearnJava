package com.ioteck.decorator;

public abstract class Decorator extends Component{
	private Component component = null;

	public Decorator(Component component) {
		//super();
		this.component = component;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		//System.out.println("Decorator do something!");
		System.out.print("Decorator: ");
		component.doSomething();
	}
}
