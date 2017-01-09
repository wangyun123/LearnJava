package com.ioteck.iostream;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file = new File("/home/developer/Learn/iotek_c++/decorator");
		File file = new File("/home/developer/workspace/iotek_java");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		
		String[] filesName = file.list();
		for (String f:filesName)
			System.out.println(f);
		System.out.println("***************[1]*****************");
		
		String[] filesName2 = file.list(new FilenameFilter(){
			public boolean accept(File arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg1.endsWith(".h");
			}		
		});
		for (String f:filesName2)
			System.out.println(f);
		System.out.println("***************[2]*****************");

		System.out.println(FacUtil.factorial(5));
		
		System.out.println("*****************[3]***************");
		print(file);
	}
	
	public static void print(File f){
		if (f != null){
			if (f.isDirectory()){
				File[] fileArray = f.listFiles();
				for (File inner:fileArray){
					print(inner);
				}
			}
			else
				System.out.println(f.getName());
		}
	}
}

class FacUtil{
	public static int factorial(int number){
		if (number==1)
			return 1;
		else
			return number*factorial(number-1);
	}
}
