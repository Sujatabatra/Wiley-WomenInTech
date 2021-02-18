package com.sujata.demo;

public class MyFirstClass {

	private void demo(){
		System.out.println("Hi I am private scope method demo() from com.sujata.demo.MyFirstClass");
	}
	public void show(){
		System.out.println("Hi I am public scope method show() from com.sujata.demo.MyFirstClass");
	}
	
	void display(){
		System.out.println("Hi I am default scope method display() from com.sujata.demo.MySecondClass");
	}
	
	void someFunction(){
		DummyClass dOb=new DummyClass();
		dOb.someMethod();
	}
}
