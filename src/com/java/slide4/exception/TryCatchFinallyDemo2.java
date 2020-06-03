package com.java.slide4.exception;

public class TryCatchFinallyDemo2 {
	public static void main(String[] args) {
		String arr[] = {"1", null, "c"};
		try {
			int a = Integer.parseInt(arr[3]);
		} catch (NullPointerException e) {
			System.out.println("Mảng bị null");
		}	catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Vượt quá số phần tử");
		} catch (NumberFormatException e) {
			System.out.println("Phần tử không phải là số");
		}  catch (Exception e) {
			System.out.println("Chương trình bị lỗi");
		}  
		
	}
}
