package com.my.visitor;

public abstract class Element {
	private String names;
	private double price;
	
	public Element(String names, double price) {
		this.names = names;
		this.price = price;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void accept(Visitor visitor);
}
