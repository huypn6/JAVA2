package com.java.slide3.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainSetStaff {

	public static void main(String[] args) {
		//compare add to set
		Set<Staff> setStaff = new TreeSet<Staff>(
			new Comparator<Staff>() {
				public int compare(Staff o1, Staff o2) {
					if (o1.equals(o2)) {
						return 0;
					} else {
						return -1;
					}
				};
		});
		setStaff.add(new Staff("1", "Poly", "1", "3000"));
		setStaff.add(new Staff("1", "Poly", "2", "3000"));
		setStaff.add(new Staff("1", "Poly", "3", "3000"));
		setStaff.add(new Staff("3", "Poly3", "3", "3000"));
		setStaff.add(new Staff("3", "Poly4", "4", "3000"));
		setStaff.add(new Staff("2", "Poly2", "1", "13000"));
		setStaff.add(new Staff("2", "Poly5", "3", "3000"));
		
		//
		List<Staff> listStaff = new ArrayList(setStaff);
		listStaff.sort(new ComparatorStaff());
		System.out.println(listStaff);
	}
}