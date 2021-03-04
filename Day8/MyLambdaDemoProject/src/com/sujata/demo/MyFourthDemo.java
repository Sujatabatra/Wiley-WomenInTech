package com.sujata.demo;

import java.util.function.Supplier;

interface Demo{
	public String show();
}
public class MyFourthDemo {

	public static void main(String[] args) {
		Demo dOb=()->"Welcome to my lambda expression demo";
		Supplier<String> dOb1=()->"Welcome to my lambda expression demo";
		
		System.out.println(dOb.show());
		System.out.println(dOb1.get());
		
		

	}

}
