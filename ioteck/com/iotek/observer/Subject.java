package com.iotek.observer;

public interface Subject {
	// 注册一个Observer观察者控件
	public abstract void registerObserver(Observer obs);
	// 删除一个已有Observer观察者控件
	public abstract void removeObserver(Observer obs);
	// 通知所有观察者
	public abstract void notifyObserver();
	
}
