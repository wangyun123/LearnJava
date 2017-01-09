package com.my.visitor;

public class Charger extends Visitor {

	@Override
	public void visit(Element element) {
		// TODO Auto-generated method stub
		System.out.println("划价:"+getName()+","+"价格:"+element.getPrice());
	}
}
