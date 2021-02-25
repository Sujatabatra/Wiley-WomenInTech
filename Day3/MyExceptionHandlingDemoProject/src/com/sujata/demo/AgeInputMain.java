package com.sujata.demo;

import java.util.Scanner;

public class AgeInputMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		AgeInput aOb=new AgeInput();
		try{
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		aOb.setAge(age); //Age UncheckedException
		
		System.out.println("person is eligible for employement, his age is "+aOb.getAge());
		
		System.out.println("Enter age : ");
		int age1=sc.nextInt();
		aOb.setOneMoreAge(age1);
		System.out.println("User is eligible for voting , his/her age is : "+aOb.getAge());
		}
		catch(AgeCheckedException ex){
			System.out.println("User is not eligible for voting");
		}
		catch (AgeUncheckedException e) {
			System.out.println(e.getMessage());
		}

	}

}
