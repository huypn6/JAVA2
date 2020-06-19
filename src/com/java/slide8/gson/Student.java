package com.java.slide8.gson;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private boolean active;
	private String[] add;
	private Student gf;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String[] getAdd() {
		return add;
	}

	public void setAdd(String[] add) {
		this.add = add;
	}

	public Student getGf() {
		return gf;
	}

	public void setGf(Student gf) {
		this.gf = gf;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", active=" + active + ", add=" + Arrays.toString(add) + ", gf="
				+ gf + "]";
	}
	
}
