package com.java.slide4.exception;

import com.java.slide3.collections.Staff;

public class MainNullPointer {
	public static void main(String[] args) {
		showName(null);
	}

	private static void showName(Staff staff) {
		if (staff != null ) {
			System.out.println(staff.getName());
		} else {
			System.out.println("Đối tượng bị null");
		}
		
		
	}

}
