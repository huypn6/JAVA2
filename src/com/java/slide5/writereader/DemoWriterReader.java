package com.java.slide5.writereader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class DemoWriterReader implements Serializable {
	public static void main(String[] args) throws IOException {
		//1. Create FileWriter
		String fileName = "E:\\Demo Input Stream.txt";
		FileWriter fileWriter = new FileWriter(fileName);
		
		//2. Write
		fileWriter.write("Tao la String day");
		
		//3. 
		fileWriter.flush();
		fileWriter.close();
	}
}
