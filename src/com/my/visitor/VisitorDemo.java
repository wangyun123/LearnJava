package com.my.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Presciption {
	private List<Element> list = new ArrayList<Element>();
	
	public void accept(Visitor visitor){
		Iterator<Element> iter = list.iterator();
		
		while(iter.hasNext()) {
			iter.next().accept(visitor);
		}
	}
	
	public void addElement(Element element){
		list.add(element);
	}
	
	public void removeElement(Element element){
		list.remove(element);
	}
}

public class VisitorDemo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element e1 = new Medicine("板蓝根", 11.0);
		Element e2 = new Medicine("胃康宁", 15.0);
		
		Presciption presciption = new Presciption();
		presciption.addElement(e1);
		presciption.addElement(e2);
		
		Visitor v1 = new Charger();
		v1.setName("zhangsan");
		
		Visitor v2 = new Pharmacy();
		v2.setName("lisi");
		
		presciption.accept(v1);
		presciption.accept(v2);
	}

}
