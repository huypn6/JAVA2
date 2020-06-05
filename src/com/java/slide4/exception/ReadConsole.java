package com.java.slide4.exception;

import java.util.Scanner;

public class ReadConsole {
	public static void main(String[] args) {
		
		//1. Scanner
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			System.out.println(a);
			
		}
	}
}
