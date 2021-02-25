package com.sujata.demo;

import java.util.Scanner;

public class MySecondExample {

	public static void main(String[] args) {
		int arr[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter no of columns : ");
		int cols=sc.nextInt();
		
		arr=new int[rows][cols];
		
//		arr=new int[rows][];
//		for(int r=0;r<=rows;r++){
//			arr[r]=new int[cols];
//		}
		
		for(int r=0;r<rows;r++){
			for(int c=0;c<cols;c++){
				System.out.println("Enter element : ");
				arr[r][c]=sc.nextInt();
			}
		}
		
		for(int r=0;r<rows;r++){
			for(int c=0;c<cols;c++){
				System.out.print(arr[r][c]+"     ");
			}
			System.out.println();
		}
	}

}
