package com.iotek.singleton;

public class Singleton {
	private static Singleton singleton;
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	private Singleton() {
		;
	}
}
