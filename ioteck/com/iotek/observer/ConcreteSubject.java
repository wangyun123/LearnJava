package com.iotek.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private List<Observer> listObserver = new ArrayList<Observer>();
	private String msg = "我日哦！";

	public void registerObserver(Observer obs) {
		// TODO Auto-generated method stub
		listObserver.add(obs);
	}

	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		listObserver.remove(obs);

	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("主体："+msg);
		for (int i=0; i<listObserver.size(); i++) {
			Observer obs = listObserver.get(i);
			obs.update(msg);
		}
	}

}
