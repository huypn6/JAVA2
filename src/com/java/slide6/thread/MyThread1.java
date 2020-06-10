package com.java.slide6.thread;

public class MyThread1 extends Thread {
	
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		Thread runnable = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					System.out.println("Thread2: " + i);
				}
			}
		});
		myThread1.setPriority(Thread.MAX_PRIORITY);
		runnable.setPriority(Thread.MIN_PRIORITY);
		
		System.gc();
		
		myThread1.start();
		// Demo Join
//		try {
//			myThread1.join();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		runnable.start();
		
	}
	
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Thread1: " + i);
		}
	}
}
