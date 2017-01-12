package com.shangxue.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	private List<Filter> filters;// = new ArrayList<Filter>();
	
	public FilterChain() {
		super();
		filters = new ArrayList<Filter>();
	}

//	public void addFilter(Filter filter) {
//		filters.add(filter);
//	}
	// 采用链条编程方式
	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}
	
	public void removeFilter(Filter filter) {
		filters.remove(filter);
	}
	
	public String doFilter(String msg) {
		String str = msg;
		for (Filter filter : filters) {
			str = filter.doFilter(str);
		}
		return str;
	}
}
