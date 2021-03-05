package com.sujata.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javassist.tools.rmi.ObjectNotFoundException;

public class MyFirstHibernateMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		// For entire application one SessionFactory object : SessionFactory is
		// SingleTon
		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		// For every Transaction one Session object
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		System.out.println("Enter Employee ID whose record you want to search for : ");
		int id = sc.nextInt();
		// if id does not exist get returns null
		Employee employee = session.get(Employee.class, id);
		if (employee == null)
			System.out.println("Record not found");
		else
			System.out.println(employee);

		// if id does not exist load throws exception ObjectNotFound
		try {
			Employee emp = session.load(Employee.class, id);
			System.out.println(emp);
		} catch (Exception ex) {
			System.out.println("Record not found!");
		}
		transaction.commit();

		session.close();

	}

}
