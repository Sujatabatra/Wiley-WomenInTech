package com.batra.demo;

public class MyMultiThreadingDemo {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" say hi!");
				
			}
		},"First Thread");
		
		t1.start();
		
		System.out.println("good Bye from main");

	}

}
