package com.java.slide7.autoboxing;

public class Main {
	
	
	public static void main(String[] args) {
		//autoboxing
		Integer integerA = 2;
		Long longA = new Long(2000);
		
		//autoboxing
		int a = 3;
		Integer b = 4;
		int c = a + b;
		
		//boxing
		Float floatA = Float.valueOf(2.3f);
		
		//unboxing
		float floatB = floatA.floatValue();
	}
}
