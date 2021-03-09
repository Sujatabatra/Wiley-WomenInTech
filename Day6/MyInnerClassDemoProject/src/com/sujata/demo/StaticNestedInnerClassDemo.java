package com.sujata.demo;

import com.sujata.demo.StaticNestedOuter.StaticNestedInner;

class StaticNestedOuter{
	
	static int x;
	static class StaticNestedInner{
		void display(){
			System.out.println("Hi I am display from StaticNestedInner");
		}
	}
}
public class StaticNestedInnerClassDemo {

	public static void main(String[] args) {
		StaticNestedOuter.StaticNestedInner sIob=new StaticNestedOuter.StaticNestedInner();
		sIob.display();

	}

}
