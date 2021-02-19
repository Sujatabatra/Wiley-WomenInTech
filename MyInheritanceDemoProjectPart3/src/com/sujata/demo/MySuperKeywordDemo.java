package com.sujata.demo;

class Parent{
	int i;

	public Parent(int i) {
		super();
		this.i = i;
	}
	
	
}
class Child extends Parent{
	int i;

	public Child(int i1, int i2) {
		super(i1);
		i = i2;
	}
	
	/*
	 * when ever we have naming ambiguity between the instance variable name of base and derived class, 
	 * then to call base class instance variable of same name
	 * we should call it with 'super' keyword..... SYNTAX : super.instance variable
	*/
	public void greater(){
		if(super.i>i){
			System.out.println("Parent i is greater");
		}
		else{
			System.out.println("Child i is greater");
		}
			
	}
	
	
}
public class MySuperKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
