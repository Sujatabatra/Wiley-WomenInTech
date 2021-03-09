package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

/*
 * Hibernate maintain first level cache for better performance
 * First Level cache is at Session level (Default)
 * we can achive second level as well as third level cache as well
 * 
 * Second Level cache is at SessionFactory level
 * 
 * Third Level Cache is at Query level
 */
public class MyFirstHibernateMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee emp=session.get(Employee.class, 103);
		System.out.println(emp);
		
		System.out.println("----------------------");
		
		Employee emp1=session.get(Employee.class, 103);
		System.out.println(emp1);
		
		transaction.commit();
		session.close();
		
		System.out.println("first level cache cleared");
		session=factory.openSession();
		transaction=session.beginTransaction();
		
		Employee emp2=session.get(Employee.class, 103);
		System.out.println(emp2);
	
		transaction.commit();
		session.close();
	}

}
