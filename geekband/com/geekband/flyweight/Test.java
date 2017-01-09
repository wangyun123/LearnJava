package com.geekband.flyweight;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extrinsicState = 22;
		FlyWeightFactory factory = new FlyWeightFactory();
		
		FlyWeight fx = factory.getFlyWeight("x");
		fx.operation(--extrinsicState);
		
		FlyWeight fy = factory.getFlyWeight("y");
		fy.operation(--extrinsicState);
		
		FlyWeight fz = factory.getFlyWeight("z");
		fz.operation(--extrinsicState);
		
		UnsharedConcreteFlyWeight unshared = new UnsharedConcreteFlyWeight();
		unshared.operation(--extrinsicState);
	}

}
