package com.my.visitor;

public class Medicine extends Element {

	public Medicine(String names, double price) {
		super(names, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
