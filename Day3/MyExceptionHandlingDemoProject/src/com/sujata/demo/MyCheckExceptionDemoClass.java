package com.sujata.demo;

import java.util.Scanner;

public class MyCheckExceptionDemoClass {

	
	static public void sleepAndUp(long time){
		System.out.println("Hello i am going to sleep for "+time+" milli sec");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hi I woke up!!");
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter time in milli second : ");
		long t=sc.nextLong();
		sleepAndUp(t);
		

	}

}
