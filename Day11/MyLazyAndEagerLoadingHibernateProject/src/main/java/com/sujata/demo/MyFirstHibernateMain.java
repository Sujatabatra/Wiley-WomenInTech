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
		SessionFactory factory=meta.getSessionFactoryBuilder().build();

		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Wife wife=session.get(Wife.class, 102);
		System.out.println("wife id : "+wife.getWifeId()+" wife name : "+wife.getWifeName());
		System.out.println("==================================");
		System.out.println("husband name : "+wife.getHusband().getHusbandName());
		transaction.commit();
		session.close();
		
	}

}
