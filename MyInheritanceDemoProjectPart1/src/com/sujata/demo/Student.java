package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;

	
	public Student(){
		super();
	}
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
//	public Student() {
//		//Implicit call is being made from derived class constructor to base class default constructor
//		System.out.println("Hi I am Student class default Constructor");
//	}
	
	

	public void input(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayStudent() {
		System.out.println("Roll No :" + rollNo);
		System.out.println("Name : " + name);
	}

}
