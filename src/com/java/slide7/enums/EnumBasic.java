package com.java.slide7.enums;

import java.io.Serializable;

public enum EnumBasic implements Serializable {

	GAME_READY, GAME_RUNNIG, GAME_OVER, GAME_PAUSE;

	public static void main(String[] args) {
		Integer one = new Integer(1);
		Integer two = new Integer(1);
		if (one == two) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}

	}
}
