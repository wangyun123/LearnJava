package com.shangxue.chain;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String msg = "<i fuck you. face>";
		System.out.println("before:"+msg);
		MsgProcessor processor = new MsgProcessor(msg);
		//String str = processor.process();
		//String str = processor.process2();
		//String str = processor.process2_1();
		String str = processor.process3();
		System.out.println("after:"+str);
	}

}
