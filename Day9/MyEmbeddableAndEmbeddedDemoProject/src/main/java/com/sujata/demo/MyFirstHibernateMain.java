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

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		// For entire application one SessionFactory object : SessionFactory is
		// SingleTon
		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		// For every Transaction one Session object
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Employee employee=new Employee("AAAA", "HR", "Associate", 45000);
		employee.setEmpAddr(new Address(101, "Street 1", "Delhi", "Delhi", "110008"));
		
		session.save(employee);
		
		transaction.commit();

		session.close();

	}

}
