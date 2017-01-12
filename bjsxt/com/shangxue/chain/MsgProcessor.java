package com.shangxue.chain;

public class MsgProcessor {
	private String msg;
	private Filter[] filters = {new HtmlFilter(), new SensitiveFilter()};

	public MsgProcessor(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String process() {
		// 方法1.直接对字符串进行过滤处理	
		String str = msg.replace("fuck", "make love");
		str = str.replace("you", "pig");
		return str;
	}
	public String process2() {
		// 方法2.添加过滤器接口Filter进行过滤处理
		/*
		Filter f01 = new HtmlFilter();
		Filter f02 = new SensitiveFilter();
		
		String str = f01.doFilter(msg);
		str  = f02.doFilter(str);*/
		
		String str = new HtmlFilter().doFilter(msg);
		str = new SensitiveFilter().doFilter(str);
		return str;
	}
	public String process2_1() {
		// 方法2-1.添加过滤器接口Filter进行过滤处理，
		// 将filter放入数组中，通过遍历数组依次调用过滤器
		String str = msg;
		for (Filter f: filters) {
			str = f.doFilter(str);
		}
		return str;
	}
	public String process3() {
		String str = msg;
		FilterChain chain1 = new FilterChain();
		chain1.addFilter(new HtmlFilter())
			 .addFilter(new SensitiveFilter());
		FilterChain chain2 = new FilterChain();
		chain2.addFilter(new FaceFilter());
		chain1.addFilter(chain2);
		str = chain1.doFilter(str);
		return str;
	}
}
