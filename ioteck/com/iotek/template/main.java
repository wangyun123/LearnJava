package com.iotek.template;

/*
 * 设计模式 - 模板模式
 * 来源：iotek Android开发零基础 Java编程全套课程精讲
 */

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new DBTeacher();
		teacher.work();
		
		teacher = new CplusTeacher();
		teacher.work();
	}

}
