package com.sujata.demo;

public class MainComplexNos {

	public static void main(String[] args) {
		Complex c1=new Complex();
		c1.display();
		System.out.println("");
		Complex c2=new Complex(7, 9);
		System.out.println("========");
		Complex c3=c2.getComplex();
		c3.display();

	}

}
