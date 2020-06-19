package com.java.slide8.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainGson {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(2);
		student.setName("Poly");
		student.setActive(true);
		student.setAdd(new String[] { "Ha Noi", "Hai Phong" });

		Student gf = new Student();
		gf.setId(3);
		gf.setName("Poly");
		gf.setActive(true);
		gf.setAdd(new String[] { "Ha Noi", "Hai Phong" });

		student.setGf(gf);

		// Get Gson object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String jsonStd = gson.toJson(student);
		System.out.println(jsonStd);

		// parse json string to object
		Student studentV2 = gson.fromJson(jsonStd, Student.class);
		System.out.println(studentV2);

	}

}
