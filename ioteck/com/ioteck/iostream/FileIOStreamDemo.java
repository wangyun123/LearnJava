package com.ioteck.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileCopyUtil.copyFile(new File(), new File());
	}

}

class FileCopyUtil{
	public static void copyFile(File src, File dst) throws IOException{
		FileInputStream input = new FileInputStream(src);
		FileOutputStream output = new FileOutputStream(dst);
		long time1 = System.currentTimeMillis();
		int data = -1;
		while ( (data = input.read()) != -1){
			output.write(data);
		}
		input.close();
		output.close();
		long time2 = System.currentTimeMillis();
		System.out.println("ok, "+(time2-time1));
	}
}