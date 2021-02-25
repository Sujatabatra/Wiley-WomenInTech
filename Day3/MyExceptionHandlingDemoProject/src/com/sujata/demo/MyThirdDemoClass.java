package com.sujata.demo;

import java.util.Scanner;

public class MyThirdDemoClass {

	public static void divide(int number1,int number2){
		try{
			int divide=number1/number2;
			System.out.println("Division Result : "+divide);
			System.out.println("Bye from try");
			return;
		}
		
//		catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("Infinite");
//		}
		finally{
			System.out.println("Hi I am finally block");
		}
//		System.out.println("Good Bye from Divide!");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter first no : ");
		int n1=sc.nextInt();
		System.out.println("Enter second no : ");
		int n2=sc.nextInt();
	
		divide(n1, n2);
		
		}
		catch(ArithmeticException ex){
			System.out.println("Infinite!");
		}
		System.out.println("Good Bye from main!");

	}

}
