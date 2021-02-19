package com.sujata.training;

import java.util.Scanner;

import com.sujata.demo.ButterPopCorn;
import com.sujata.demo.CaramelPopCorn;
import com.sujata.demo.PopCorn;
import com.sujata.demo.PopCornMart;

public class MyMain {

	public static void main(String[] args) {
		// PopCorn p1=new PopCorn();
		// p1.pop();
		//
		// ButterPopCorn p2=new ButterPopCorn();
		// p2.pop();
		//
		// CaramelPopCorn p3=new CaramelPopCorn();
		// p3.pop();
		//
		/*
		 * Dynamic method dispatch Base class reference variable are type
		 * compatible with derived class but reverse is not true.
		 * Object Slicing : that if reference variable is of base class and object is of derived 
		 * then only functionality which is coming from base will be accessible.
		 */

		 PopCorn pOb;
		// pOb=new PopCorn();
		// pOb.pop();
		//
		 pOb=new ButterPopCorn();
		 pOb.pop();
		 //Typecasted refernce type to derived , so reference type is no more of type base
		 ((ButterPopCorn)pOb).butterQuantity(5);
		//
		// pOb=new CaramelPopCorn();
		// pOb.pop();

		System.out.println("=====================");
//		PopCornMart pMart = new PopCornMart();
//
//		Scanner scanner = new Scanner(System.in);
//		String ans = null;
//		do {
//
//			System.out.println("Enter choice of popcorn,  p for plain , b for butter and c for caramel popcorn");
//			String choice = scanner.next();
//
//			switch (choice) {
//			case "p":
//				pMart.setPopCorn(new PopCorn());
//				break;
//			case "b":
//				pMart.setPopCorn(new ButterPopCorn());
//				break;
//			case "c":
//				pMart.setPopCorn(new CaramelPopCorn());
//				break;
//
//			default:
//				System.out.println("Invalid Choice!");
//				break;
//			}
//			pMart.buy();
//			System.out.println("Do you want to buy more popcorns : ");
//			ans = scanner.next();
//		} while (ans.equalsIgnoreCase("y"));

	}

}
