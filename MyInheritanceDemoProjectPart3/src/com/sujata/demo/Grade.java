package com.sujata.demo;

public class Grade extends Marks {

	private double percentage;
	private String grade;

	public Grade(int rollNo, String name, int marks1, int marks2, int marks3) {
		super(rollNo, name, marks1, marks2, marks3);

	}
	public Grade(){
		super(); //implicit call so optional to specify this statement
	}

	public double getPercentage() {
		percentage = (getMarks1() + getMarks2() + getMarks3()) / 3;
		return percentage;
	}

	public String getGrade() {
		if (percentage > 75)
			grade = "A Grade";
		else
			grade = "B Grade";
		return grade;
	}

	public void displayStudent() {
		super.displayStudent();
		System.out.println("Percentage : " + getPercentage());
		System.out.println("Grade : " + getGrade());
	}
	
	

}
