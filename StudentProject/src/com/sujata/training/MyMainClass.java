package com.sujata.training;

import com.sujata.demo.Student;

public class MyMainClass {

	public static void main(String[] args) {
		Student st=new Student();
		st.input(111, "AAAAA");
		st.displayStudent();
		
		System.out.println("======================");
		
		Marks marksOb=new Marks();
		marksOb.inputStudentWithMarks(101, "BBBBB", 78, 89, 76);
		marksOb.displayStudentWithMarks();

	}

}
