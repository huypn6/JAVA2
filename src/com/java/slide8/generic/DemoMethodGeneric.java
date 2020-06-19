package com.java.slide8.generic;

import java.util.ArrayList;
import java.util.List;

public class DemoMethodGeneric {
	
	public static void main(String[] args) {
		List<?> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		System.out.println(count(a));
		System.out.println(count(b));
		System.out.println(count(c));
	}

	private static int count(List<?> list) {
		return list.size();
	}

	
}
