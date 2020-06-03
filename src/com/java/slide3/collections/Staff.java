package com.java.slide3.collections;

public class Staff {
	private String stt;
	private String name;
	private String age;
	private String salary;

	public Staff() {
	}

	public Staff(String stt, String name, String age, String salary) {
		super();
		this.stt = stt;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getStt() {
		return stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		Staff otherStaff = (Staff) obj;
		boolean equalStt = this.stt.equals(otherStaff.stt);
		boolean equalName = this.name.equals(otherStaff.name);
		boolean equalAge = this.age.equals(otherStaff.age);
		boolean equalSalary = this.salary.equals(otherStaff.salary);
		return equalStt && equalName && equalAge && equalSalary;
	}

	@Override
	public String toString() {
		return "Staff [stt=" + stt + ", name=" + name + ", age=" + age + ", salary=" + salary + "]\n";
	}
	
	

}
