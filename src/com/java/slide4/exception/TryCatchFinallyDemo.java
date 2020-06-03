package com.java.slide4.exception;

public class TryCatchFinallyDemo {
	public static void main(String[] args) {
		callDb();
		System.out.println("Done!!");
	}

	
	private static void callDb() {
		try {
			
		} finally {
			// TODO: handle finally clause
		}
		
		try {
			int a = 6, b = 0;
			int c = a/b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
