package com.iotek.strategy;

/*
 * 设计模式 - 策略模式
 * 来源：iotek Android开发零基础 Java编程全套课程精讲
 */

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3,8,12,5,9,2,6};
		Strategy bubble = new BubbleSort();
		Context context = new Context(bubble);
		context.sort(array);
		context.print(array);
	}
}
class Context{
	private Strategy sort=null;
	public Context(Strategy sort){
		this.sort = sort;
	}
	
	public void sort(int [] array){
		sort.sort(array);
	}
	
	public void print(int [] array){
		for (int i=0; i<array.length; i++){
			System.out.print(array[i]+"  ");
		}
	}
}

interface Strategy{
	public abstract void sort(int [] array);
}
// 封装冒泡排序法
class BubbleSort implements Strategy{
	public void sort(int [] array){
		System.out.println("冒泡排序法");
		for (int i=0; i<array.length-1; i++){
			for (int j=0; j<array.length-i-1; j++){
				if (array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
}

//封装选择排序法
class SelectSort implements Strategy{
	public void sort(int [] array){
		System.out.println("选择排序法");
	}
}