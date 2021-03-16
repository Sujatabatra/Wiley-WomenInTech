package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
public class FirstSpringbootHibernateProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeePresentation empPresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootHibernateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			empPresentation.showMenu();
			System.out.println("Select choice ");
			int choice =sc.nextInt();
			empPresentation.performMenu(choice);
			
		}
		
	}

}
