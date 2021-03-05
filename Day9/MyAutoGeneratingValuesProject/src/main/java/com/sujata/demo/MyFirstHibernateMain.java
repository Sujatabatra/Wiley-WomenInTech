package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MyFirstHibernateMain {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		//For entire application one SessionFactory object : SessionFactory is SingleTon
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		//For every Transaction one Session object
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Employee emp1=new Employee("AAAAA", "Sales", "Associate", 75000);
		Employee emp2=new Employee("BBBBB", "IT", "Manager", 175000);
		Employee emp3=new Employee("CCCCC", "Sales", "Sr. Associate", 85000);
		Employee emp4=new Employee("DDDDD", "HR", "Executive", 35000);
		Employee emp5=new Employee("EEEEE", "Marketing", "Executive", 25000);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		transaction.commit();
		System.out.println("Employee Record Added ");
		session.close();
		factory.close();
	}

}
