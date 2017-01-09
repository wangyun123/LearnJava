package com.my.visitor;

public abstract class Visitor {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void visit(Element element);

}
