package com.my.iterator;

import java.util.Vector;

public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector vec = new Vector();
		//vec.add();
		//Aggregate agg = new ConcreteAggregate();
	}

}
/*
interface Iterator {
	public abstract Object first();
	public abstract Object next();
	public abstract Object currentItem();
	public abstract boolean isDone();
}

class ConcreteIterator implements Iterator {
	private int currentIndex=0;
	private Vector vector=null;
	
	
	public ConcreteIterator(Vector vector) {
		this.vector = vector;
	}


	public Object first() {
		// TODO Auto-generated method stub
		currentIndex = 0;
		return vector.get(currentIndex);
	}


	public Object next() {
		// TODO Auto-generated method stub
		currentIndex++;
		return vector.get(currentIndex);
	}


	public Object currentItem() {
		// TODO Auto-generated method stub
		return vector.get(currentIndex);
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		if (currentIndex >= this.vector.size()-1) {
			return false;
		} else {
			return true;
		}
	}	
}

interface Aggregate {
	public Iterator createIterator();
}

class ConcreteAggregate implements Aggregate {
	private Vector vector=null;

	public ConcreteAggregate(Vector vector) {
		this.vector = vector;
	}

	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(vector);
	}

	public Vector getVector() {
		return vector;
	}

	public void setVector(Vector vector) {
		this.vector = vector;
	}
	
}
*/


