package com.java.slide8.gson;

public class MainGenericClass {
	public static void main(String[] args) {
		Pair pair = new Pair<Student, Student>();
		pair.setS(new Student());
		pair.setT(new Student());
	}
}
