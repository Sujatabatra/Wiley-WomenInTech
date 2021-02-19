package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	
	public Grade(){
		/*Implicit call is being made from derived class constructor to base class default constructor
		 * Implicit call fails as there is no default constructor in parents class, so we need give explicit call to argumented constructor
		 * we can make implicit call to base class constructor using 'super' Keyword
		 * Rule : super call must be the first statement in the derived class constructor 
		*/
//		super(0, 0, 0);
		super();
		System.out.println("Hi I am Grade class default constructor");
//		super(0, 0, 0);
	}
	
	
	public double getPercentage() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		return percentage;
	}

	public String getGrade() {
		if(percentage>75)
			grade="A Grade";
		else
			grade="B Grade";
		return grade;
	}
	
	public void displayStudentFullDetails(){
		displayStudentWithMarks();
		System.out.println("Percentage : "+getPercentage());
		System.out.println("Grade : "+getGrade());
	}
	
	
}
