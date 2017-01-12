package com.shangxue.chain;

public class FaceFilter implements Filter {

	public String doFilter(String msg) {
		// TODO Auto-generated method stub
		String str = msg.replace("face", "^_^");
		
		return str;
	}

}
