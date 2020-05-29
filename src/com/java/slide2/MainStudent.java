package com.java.slide2;

public class MainStudent {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId("1");
		student1.setName("Poly1");
		student1.id_class = Student.id_class + 5;
		
		Student student2 = new Student();
		student1.setId("2");
		student1.setName("Poly2");
		student2.id_class = student1.id_class + 10;
		
		System.out.println(student1.id_class);
		
	}
}
