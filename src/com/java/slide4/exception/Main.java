package com.java.slide4.exception;

public class Main {
	public static void main(String[] args) {
		A a1 = new A(1);
		A a2 = a1;
		a2.setA(3);
		System.out.println(a1.getA());
	}
}
