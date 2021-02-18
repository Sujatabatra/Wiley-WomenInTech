package com.sujata.demo;

/*
 * Source File Rules:
 * 1. In one source file we can have as many classes as much we want, but only one public class
 * 2. Name of source file should match with the name of public class
 * 3. If in a source file there is no public class then no name restriction is applicable
 * 4. main() method must always be in public class
 * 5. Class can be either public or default, we can't have private classes
 * 6. Sequence : Package statement, import statements, classes
 */
public class MySecondClass {

	public void show(){
		System.out.println("Hi I am public scope method show() from com.sujata.demo.MyFirstClass");
	}
	
	void display(){
		System.out.println("Hi I am default scope method display() from com.sujata.demo.MySecondClass");
	}
	
	public void doSomething(){
		MyFirstClass fOb=new MyFirstClass();
		//in same package default is visible
		fOb.display();
		//public is visible from everywhere
		fOb.show();
		
	}
}

class DummyClass{
	
	public void someMethod(){
		System.out.println("Hi I am public scope method someMethod() from com.sujata.demo.DummyClass");
	}
}
