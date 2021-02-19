package com.sujata.demo;

import com.sujata.demo.Student;

/*
 * Rules for constructor
 * 1. All dervied class constructor gives implicit call to base class default constructor using 'super()'
 * 2. If we don't have default constructor in base class , 
 * then its mandatory for us to give implicit call to base class argumented constuctor using "super(arguments)" from dervived class constructor
 * 3. super()/super(arguments) call must be the first statement in dervived class constructor
 * 4. explcit call to base class constructor can be made from both argumented as well as non argumented constructor of derived class using 'super' keyword
 */
public class Marks extends Student {

	private int marks1,marks2,marks3;

	
	public Marks(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public Marks(){
		super(); //implicit call so optional to specify this statement
	}
	public void inputStudent(int rollNo,String name,int marks1,int marks2,int marks3){
		inputStudent(rollNo, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		
	}
	
	public void displayStudent(){
		/*
		 * when ever we have naming ambiguity between the method name of base and derived class, then to call base class method of same name
		 * we should call it with 'super' keyword..... SYNTAX : super.methodname(arguments)
		 * or
		 * whenever we want to call the base class version of overridden method we make use of keyword 'super'
		*/
		
		super.displayStudent(); // default call will be to current method(Marks class displayStudent()) : recursive
		System.out.println("Marks1 : "+marks1);
		System.out.println("Marks2 : "+marks2);
		System.out.println("Marks 3 : "+marks3);
	}
	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	
}
