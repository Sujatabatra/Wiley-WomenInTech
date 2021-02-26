package com.sujata.demo;

public class WrapperDemoClass {

	public static void main(String[] args) {
//		int i;
//		System.out.println("i :"+i);

		Integer i1=new Integer(20); // Heap
		System.out.println("i1 : "+i1);
		
		Integer i2=new Integer("10");
		System.out.println("i2 : "+i2);
		
		//below statetment support happen from java 1.5 onwards
		Integer i3=i1+i2;
		System.out.println("Sum : "+i3);
		//xxxValue() : is used to convert wrapper to its respective primitive type
//		int a1=i1.intValue();
//		int a2=i2.intValue();
//		
//		int a3=a1+a2;
//		
//		//valueOf : primitive to wrapper;
//		Integer sum=Integer.valueOf(a3);
//		
//		System.out.println("Sum : "+sum);
	}

}
