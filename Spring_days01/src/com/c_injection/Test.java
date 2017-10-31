package com.c_injection;

import java.util.Arrays;
import java.util.List;

public class Test {
	private List list;
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<Integer> list =  Arrays.asList(1, 2, 9, 4, 5); 
		System.out.println(list.toString());
	}

}
