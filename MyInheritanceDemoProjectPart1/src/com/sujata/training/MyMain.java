package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
//		Student student=new Student();
//		student.input(101, "AAAAA");
//		student.displayStudent();
//
//		System.out.println("==================");
		
		Grade gradeObject=new Grade();
		gradeObject.inputStudentWithMarks(111, "BBBB", 78, 90, 76);
		gradeObject.displayStudentFullDetails();
	}

}
