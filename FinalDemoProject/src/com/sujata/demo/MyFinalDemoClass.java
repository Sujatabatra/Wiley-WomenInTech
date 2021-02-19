package com.sujata.demo;

/*
 * final : variable, method, class
 * final variable : we won't be able to change its value
 * final method : we won't be able to override final method
 * final class : we won't be able to inherit final class
 */

final class GrandParent{
	public void display(){
		System.out.println("Hi I am display method from GrandParent class");
	}
}
class Parent/* extends GrandParent*/{
	private int i;
	final private int j = 50;

	public void manipulateValues() {
		i = i + 10;
		// we can't change the value of j as its marked as final
		// j=j+50;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}

	// public final void show(){
	final public void show() {
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}

	public void demo() {
		System.out.println("Hi I am demo method from Parent");
	}

}

class Child extends Parent {

	// public void show() {
	// System.out.println("Displaying from Child class");
	// System.out.println("i : " + getI());
	// System.out.println("j : " + getJ());
	// }

	public void demo() {
		System.out.println("Hi I am demo method from Child Class");
	}
}

public class MyFinalDemoClass {

	public static void main(String[] args) {
		Parent bOb = new Parent();
		bOb.manipulateValues();
		System.out.println("i : " + bOb.getI());
		System.out.println("j : " + bOb.getJ());

		System.out.println("==================");
		bOb.manipulateValues();
		System.out.println("i : " + bOb.getI());
		System.out.println("j : " + bOb.getJ());

	}

}
