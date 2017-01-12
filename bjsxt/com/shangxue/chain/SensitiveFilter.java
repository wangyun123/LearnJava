package com.shangxue.chain;

public class SensitiveFilter implements Filter {

	public String doFilter(String msg) {
		// TODO Auto-generated method stub
		msg = msg.replace("fuck", "make love").replace("you", "pig");
		return msg;
	}

}
