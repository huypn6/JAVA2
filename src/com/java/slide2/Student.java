package com.java.slide2;

public class Student {
	private static final String CLASS_CODE = "MOBILE";
	public static int id_class = 5;
	static {
		id_class += 5;
	}
	
	private String id;
	private String name;

	static {
		System.out.println("Call Static");
	}
	
	
	public Student() {
		System.out.println("Call Student()");
	}
	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName() + this.getId();
	}
	
}
