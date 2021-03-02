package com.sujata.client;

import java.util.Scanner;

import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String args[]){
		
		EmployeePresentation empPresentation=new EmployeePresentationImpl();
		
		Scanner sc=new Scanner(System.in);
		while(true){
			empPresentation.showMenu();
			int choice=sc.nextInt();
			empPresentation.performMenu(choice);
		}
	}
}
