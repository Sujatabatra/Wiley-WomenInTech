package com.sujata.demo;


public class NestedInnerClassDemo {

	public static void main(String[] args) {
		Outer oOb=new Outer();
		oOb.setI(10);
		oOb.display();
		
		Outer.Inner iOb=oOb.new Inner();
		iOb.setJ(20);
		iOb.show();

	}

}
