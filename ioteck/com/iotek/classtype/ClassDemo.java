package com.iotek.classtype;

public class ClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee  employee = new Employee("adf", 20);
		Class<?> classType = employee.getClass();
		System.out.println("**************employee.getClass()*********");
		System.out.println(classType.getName());
		System.out.println(classType.getSuperclass().getName());
		
		classType = Employee.class;
		System.out.println("**************Employee.class**************");
		System.out.println(classType.getName());
		System.out.println(classType.getSuperclass().getName());
		//classType.getMethod(arg0, arg1)
		
		try{
			classType = Class.forName("com.iotek.classtype.Employee");
			System.out.println("**************Class.forName**************");
			System.out.println(classType.getName());
			System.out.println(classType.getSuperclass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class Employee {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}