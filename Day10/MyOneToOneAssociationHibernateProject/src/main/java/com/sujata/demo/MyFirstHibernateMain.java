package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Husband;
import com.sujata.bean.Wife;

public class MyFirstHibernateMain {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		//For entire application one SessionFactory object : SessionFactory is SingleTon
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		//For every Transaction one Session object
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Wife wife1=new Wife(101, "Abha");
		Wife wife2=new Wife(102, "Bharti");
		Wife wife3=new Wife(103, "Chandani");
		Wife wife4=new Wife(104, "Deepa");
		
		Husband husband1=new Husband(111, "Ashish");
		Husband husband2=new Husband(222, "Bharat");
		Husband husband3=new Husband(333, "Chandan");
		Husband husband4=new Husband(444, "Deepak");
		
		wife1.setHusband(husband4);
		wife2.setHusband(husband3);
		wife3.setHusband(husband2);
		wife4.setHusband(husband1);
		
		
		husband1.setWife(wife4);
		husband2.setWife(wife3);
		husband3.setWife(wife2);
		husband4.setWife(wife1);
		
		session.save(wife1);
		session.save(wife2);
		session.save(wife3);
		session.save(wife4);
		
		session.save(husband1);
		session.save(husband2);
		session.save(husband3);
		session.save(husband4);
		
		transaction.commit();
		
		System.out.println("Records Added ");
		
		session.close();
		
	}

}
