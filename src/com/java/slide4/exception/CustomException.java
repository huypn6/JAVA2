package com.java.slide4.exception;

public class CustomException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CustomException() {
		super();
	}
	
	public CustomException(String message){
		throw new RuntimeException(message);
	}
	
	public static void main(String[] args) {
		throw new CustomException("Chương trình bị lỗi");
	}

}
