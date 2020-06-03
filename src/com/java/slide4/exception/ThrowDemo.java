package com.java.slide4.exception;

import java.io.FileNotFoundException;

public class ThrowDemo {
	public static void main(String[] args) {
		try {
			callDB();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//throw new RuntimeException("Lỗi Chương trình");
		}
	}

	private static void callDB() throws FileNotFoundException {
		throw new FileNotFoundException("Chả có file nào gọi mà vẫn lỗi");
		
	}
}
