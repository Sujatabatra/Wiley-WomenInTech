package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.BusinessMan;
import com.sujata.bean.Employee;
import com.sujata.bean.Person;


public class MyFirstHibernateMain {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		//For entire application one SessionFactory object : SessionFactory is SingleTon
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		//For every Transaction one Session object
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Person p1=new Person(101, "AAA");
		Employee e1=new Employee(102, "BBBBB", "Associate", "IT", "45000");
		BusinessMan b1=new BusinessMan(103, "CCCC", "Retailer", 785610);
		
		session.save(p1);
		session.save(e1);
		session.save(b1);
		
		transaction.commit();
		
		System.out.println("Records Added ");
		
		session.close();
		
	}

}
