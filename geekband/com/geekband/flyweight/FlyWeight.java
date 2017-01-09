package com.geekband.flyweight;

import java.util.Hashtable;

abstract class FlyWeight {
	public abstract void operation(int extrinsicState);
}

class ConcreteFlyWeight extends FlyWeight {
	@Override
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub
		System.out.println("共享的具体ConcreteFlyWeight: " + extrinsicState);
	}
}

class UnsharedConcreteFlyWeight extends FlyWeight {
	@Override
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体UnsharedConcreteFlyWeight: " + extrinsicState);
	}
}

class FlyWeightFactory {
	private Hashtable<String, ConcreteFlyWeight> flyweights = new Hashtable<String, ConcreteFlyWeight>();
	
	public FlyWeightFactory() {
		flyweights.put("x", new ConcreteFlyWeight());
		flyweights.put("y", new ConcreteFlyWeight());
		flyweights.put("z", new ConcreteFlyWeight());
	}
	
	public FlyWeight getFlyWeight(String key) {
		return ((FlyWeight)flyweights.get(key));
	}
}