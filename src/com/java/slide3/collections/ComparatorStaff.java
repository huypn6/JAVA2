package com.java.slide3.collections;

import java.util.Comparator;

public class ComparatorStaff implements Comparator<Staff>{

	@Override
	public int compare(Staff o1, Staff o2) {
		String ageStaff1 = o1.getAge();
		String ageStaff2 = o2.getAge();
		
		String slStaff1 = o1.getSalary();
		String slStaff2 = o2.getSalary();
		if(ageStaff1.compareTo(ageStaff2) == 0) {
			return slStaff1.compareTo(slStaff2);
		} else {
			return ageStaff1.compareTo(ageStaff2);
		}
	}

}
