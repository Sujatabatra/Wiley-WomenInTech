package com.sujata.demo;

public class AdditionMain {

	public static void main(String[] args) {
		Addition aOb=new Addition();
		int sum=aOb.sum(1,2,3,4,5);
		System.out.println("Sum : "+sum);
		
		int s=aOb.sum(11,22,33);
		System.out.println("Sum of Three integers "+s);
		
		double su=aOb.sum("Sujata", 3.4,5.6,7.8,9.0);
		System.out.println("Sum of 4 doubles : "+su);

	}

}
