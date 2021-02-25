package com.sujata.demo;

import java.util.Scanner;

public class MyFirstExample {

	public static void main(String[] args) {
		int arr[];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total no of elements : ");
		int total=sc.nextInt();
		
		arr=new int[total];
		
		for(int index=0;index<total;index++){
			System.out.println("Enter "+(index+1)+" element : ");
			int element=sc.nextInt();
			arr[index]=element;
		}
		
		for(int value:arr){
			System.out.println(value);
		}

	}

}
