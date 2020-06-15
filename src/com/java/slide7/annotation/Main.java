package com.java.slide7.annotation;

@MyAnnotation(author = "HuyPN2")

public class Main {

	@Deprecated
	void state(){
		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int a;
		Main main = new Main();
		main.state();
				
	}
}
