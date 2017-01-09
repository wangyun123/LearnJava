package com.my.iterator;
/*
 * Java设计模式系列之迭代器模式
 * http://www.cnblogs.com/ysw-go/p/5384516.html
 * 
 */
public class ListIteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ConcreteAggregate();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}

class ConcreteIterator implements Iterator {
	private List list=null;
	private int index;
	
	public ConcreteIterator(List list) {
		super();
		this.list = list;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (index >= list.getSize()) {
			return false;
		} else {
			return true;
		}
	}
	
	public Object next() {
		// TODO Auto-generated method stub
		Object object = list.get(index);
		index++;
		return object;
	}	
}

interface List {
	public void add(Object obj);
	public Object get(int index);
	public Iterator iterator();
	public int getSize();
}

class ConcreteAggregate implements List {
	private Object[] list;
	private int size = 0;
	private int index = 0;
	
	public ConcreteAggregate() {
		index=0;
		size=0;
		list = new Object[100];
	}
	public void add(Object obj) {
		// TODO Auto-generated method stub
		list[index++] = obj;
		size++;
	}
	public Object get(int index) {
		// TODO Auto-generated method stub
		return list[index];
	}
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	
}


