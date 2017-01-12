package com.shangxue.chain;

public class HtmlFilter implements Filter {

	public String doFilter(String msg) {
		// TODO Auto-generated method stub
		msg = msg.replace("<", "[").replace(">", "]");
		return msg;
	}

}
