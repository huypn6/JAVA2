package com.java;

import java.io.Serializable;

public class Cat extends Aninal implements AnimalInterface, Serializable {
	
	public Cat() {
		super();
	}

	@Override
	public void makeSound() {
		System.out.println("Meo meo!!!!");
	}

	@Override
	public void run() {
		System.out.println("Cat running.....");
		System.out.println(this.a);
	}
}
