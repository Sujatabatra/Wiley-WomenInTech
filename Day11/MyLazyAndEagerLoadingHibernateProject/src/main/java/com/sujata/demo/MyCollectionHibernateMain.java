package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Department;
import com.sujata.bean.Husband;
import com.sujata.bean.Wife;

public class MyCollectionHibernateMain {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();

		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		
		Department dep=session.get(Department.class, "D001");
		System.out.println("Department Id :"+dep.getDepartmentId()+" department Name : "+dep.getDepartmentName());
		transaction.commit();
		session.close();
		
	}

}
