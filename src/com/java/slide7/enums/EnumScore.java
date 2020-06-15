package com.java.slide7.enums;
/**
 * Create enum to ....
 * @author Huy
 *
 */
public enum EnumScore {
	YEU(1, "Yếu", new int[] {1, 2, 3}),
	KEM(2, "Kém", new int[] {4}),
	TRUNG_BINH(3, "Trung Bình", new int[] {5, 6}),
	KHA(4, "Khá", new int[] {7, 8}),
	GIOI(5, "Giỏi", new int[] {9, 10}),
	;

	private final Integer id;
	private final String name;
	private final int[] score;

	EnumScore(int id, String name, int[] score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public Integer getId() {
		return id;
	}

	public int[] getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

}
