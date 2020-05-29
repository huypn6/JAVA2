package com.java.slide3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DemoListSet {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 6, 4, 1, 9, 3, 8, 6, 6 };
		//list
		List<Integer> listInt = Arrays.asList(intArr);
//		System.out.println(listInt.size());
		
		//set
		Set<Integer> setInt = new TreeSet<Integer>(listInt);
//		System.out.println(setInt.size());
//		System.out.println("Set: " + setInt);
		
		//sort
		Collections.sort(listInt);
		Collections.reverse(listInt);
//		System.out.println("List: " + listInt);
		
		listInt.forEach(item ->{
			System.out.println(item);
		});
		
		for (Integer integer : setInt) {
			System.out.println(integer);
		}
		
	}

}
