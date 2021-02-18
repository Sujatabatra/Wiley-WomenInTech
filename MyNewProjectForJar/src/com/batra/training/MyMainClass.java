package com.batra.training;

import com.sujata.demo.Reverse;

public class MyMainClass {

	public static void main(String[] args) {
		Reverse rOb=new Reverse();
		rOb.setNumber(12345);
		rOb.calculateReverse();
		System.out.println("Reverse : "+rOb.getReverse());
		

	}

}
