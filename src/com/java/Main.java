package com.java;

public class Main {
	
	public static void main(String[] args) {
		Aninal cat = new Cat();
		cat.makeSound();
		
		AnimalInterface cat2 = new Cat();
		System.out.println(cat2.a);
	}
}
