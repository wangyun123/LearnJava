package com.iotek.template;

/*
 * 老师工作流程是个固定的过程，包括：
 * 		prepared(); 授课前准备
 * 		teaching(); 进行授课
 * 		end();		授课结束
 */
public abstract class Teacher {

	public void prepared() {
		System.out.println("打开教室門");
		System.out.println("走上讲台");
	}
	
	public abstract void teaching();
	
	public void end() {
		System.out.println("离开讲台");
		System.out.println("关上教室門");
	}
	// 模板方法
	public void work() {
		prepared();
		teaching();
		end();
	}
}
