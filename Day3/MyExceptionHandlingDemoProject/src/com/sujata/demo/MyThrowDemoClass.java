package com.sujata.demo;

import java.util.Scanner;

public class MyThrowDemoClass {

	public static void divide(int number1, int number2) {
		if (number2 == 0)
			throw new ArithmeticException("Infinity");
		else {
			int div = number1 / number2;
			System.out.println("Division Result : " + div);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no . : ");
		int n1=sc.nextInt();
		System.out.println("Enter second no. : ");
		int n2=sc.nextInt();
		
		divide(n1, n2);
		
		

	}

}
