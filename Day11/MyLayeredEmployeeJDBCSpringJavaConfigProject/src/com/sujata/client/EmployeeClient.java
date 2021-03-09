package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String args[]){
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("myjdbc.xml");
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(MyJdbcConfiguration.class);
		
		EmployeePresentation empPresentation=(EmployeePresentation)springContainer.getBean("presentation");
//		EmployeePresentation empPresentation=new EmployeePresentationImpl();
		
		Scanner sc=new Scanner(System.in);
		while(true){
			empPresentation.showMenu();
			int choice=sc.nextInt();
			empPresentation.performMenu(choice);
		}
	}
}
