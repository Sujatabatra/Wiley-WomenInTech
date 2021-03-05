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

		//transient state
		Employee emp=new Employee(108, "HHHHHH", "Sales", "Executive", 25000);
		
		session.save(emp);
		//persistent state
		
//		emp.setEmpName("Falak");
		
		transaction.commit();
		session.close();
		//Detached
		emp.setEmpName("Garima");
		
		session=factory.openSession();
		transaction=session.beginTransaction();
		
		session.update(emp);
		
		transaction.commit();
		session.close();
	}

}
