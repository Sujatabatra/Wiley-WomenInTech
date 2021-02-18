package com.sujata.training;

import com.sujata.demo.Complex;

public class MainComplex {

	public static void main(String[] args) {
		
		Complex c1=new Complex();
		
		c1.input(5, 9);
		
		System.out.print("First Complex No : ");
		c1.display();
		
		Complex c2=new Complex();
		c2.input(7, -3);
		System.out.print("Second Complex No : ");
		c2.display();
		
		Complex c3=new Complex();
		c3.sumComplex(c1, c2);
		
		System.out.print("Sum of Complex Nos : ");
		c3.display();
	}

}
