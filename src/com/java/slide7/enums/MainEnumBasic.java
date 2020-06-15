package com.java.slide7.enums;

public class MainEnumBasic {
	
	public static void main(String[] args) {
		EnumBasic[] basics = EnumBasic.values();
		for (EnumBasic enumBasic : basics) {
			System.out.println(enumBasic.name());
		}
	}
}
