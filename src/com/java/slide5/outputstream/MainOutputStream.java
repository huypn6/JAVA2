package com.java.slide5.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainOutputStream {
	public static void main(String[] args) throws IOException {

		// 1. Khởi tạo Stream (Input/Out)
		String fileName = "E:\\Demo Input Stream.txt";
		FileOutputStream outputStream = new FileOutputStream(fileName, true);

		// 2. Đọc file ghi ra byte
				// Đọc 1 đoạn String ghi ra byte
		byte[] bytes1 = "\nJava 2 Poly 1".getBytes();
		byte[] bytes2 = "\nJava 2 Poly 2".getBytes();
		
		// 3. Dùng hàm write hoặc read
		outputStream.write(bytes1);
		outputStream.write(bytes2);
		System.out.println("Done!");
		

		
		

	}
}
