package com.my.visitor;

public class Pharmacy extends Visitor {

	@Override
	public void visit(Element element) {
		// TODO Auto-generated method stub
		System.out.println("药房:"+getName()+","+"抓药:"+element.getNames());
	}

}
