package com.java.slide5.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainInputStream {
	public static void main(String[] args) throws IOException {
		
		//1. Khởi tạo Stream (Input/Out)
		String fileName = "E:\\Demo Input Stream.txt";
		FileInputStream inputStream = new FileInputStream(fileName);
		
		int result;
		//3 - 2. Dùng hàm write hoặc read
		while ((result = inputStream.read() )!= -1) {
			System.out.print((char) result);
		}
		
		//2. Đọc file ghi ra byte
		//	Đọc 1 đoạn String ghi ra byte
		/*byte[] byteCharacter = new byte[1];
		byteCharacter[0] = (byte) result;
		String string = new String(byteCharacter); 
		System.out.println(result + " : " +string);*/
		
	}
}
