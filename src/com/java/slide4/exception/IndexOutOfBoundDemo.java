package com.java.slide4.exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundDemo {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		
		System.out.println(integers.get(10));
	}
}
