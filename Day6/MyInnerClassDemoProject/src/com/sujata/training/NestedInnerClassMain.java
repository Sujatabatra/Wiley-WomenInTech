package com.sujata.training;

import com.sujata.demo.Outer;

public class NestedInnerClassMain {

	public static void main(String args[]){
		Outer oOb=new Outer();
		Outer.Inner iOb=oOb.new Inner();
	}
}
