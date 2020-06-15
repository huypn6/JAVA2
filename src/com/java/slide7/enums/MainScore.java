package com.java.slide7.enums;

public class MainScore {
	
	public static void main(String[] args) {
		checkDiem(6);
	}

	private static void checkDiem(int scoreInput) {
		for (EnumScore enumScore : EnumScore.values()) {
			int[] score = enumScore.getScore();
			for (int i : score) {
				if(i == scoreInput) {
					System.out.println(enumScore.getName());
					return;
				}
			}
		}
	}
}
