package com.java;

public abstract class Aninal {

	public Aninal() {
		System.out.println("Animal !!!");
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract protected void makeSound();
}
