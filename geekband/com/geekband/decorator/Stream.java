package com.geekband.decorator;

/*
 * 设计模式 - 装修模式 decorator
 * 来源：网易云课堂 Android微专业 geekband Android设计模式
 */

public abstract class Stream {
	public abstract char read(int number);
	public abstract void seek(int position);
	public abstract void write(char data);
}
