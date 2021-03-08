package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.sujata.bean.Employee;
import com.sujata.bean.Project;


public class MyFirstHibernateMain {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		//For entire application one SessionFactory object : SessionFactory is SingleTon
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		//For every Transaction one Session object
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Employee emp1=new Employee(101, "AAAA");
		Employee emp2=new Employee(102, "BBBB");
		Employee emp3=new Employee(103, "AAAA");
		Employee emp4=new Employee(104, "CCCC");
		Employee emp5=new Employee(105, "DDDD");
		
				
		Project pr1=new Project("P001", "Project 1");
		Project pr2=new Project("P002", "Project 2");
		Project pr3=new Project("P003", "Project 3");
		
		emp1.getProjects().add(pr3);
		emp1.getProjects().add(pr1);
		
		emp2.getProjects().add(pr1);
		emp2.getProjects().add(pr2);
		emp2.getProjects().add(pr3);
		
		emp3.getProjects().add(pr1);
		emp3.getProjects().add(pr2);
		
		emp4.getProjects().add(pr1);
		emp4.getProjects().add(pr2);
		emp4.getProjects().add(pr3);
		
		emp5.getProjects().add(pr2);
		emp5.getProjects().add(pr3);
		
		pr1.getEmployees().add(emp1);
		pr1.getEmployees().add(emp2);
		pr1.getEmployees().add(emp3);
		pr1.getEmployees().add(emp4);
		
		pr2.getEmployees().add(emp2);
		pr2.getEmployees().add(emp3);
		pr2.getEmployees().add(emp4);
		pr2.getEmployees().add(emp5);
		
		pr3.getEmployees().add(emp1);
		pr3.getEmployees().add(emp2);
		pr3.getEmployees().add(emp4);
		pr3.getEmployees().add(emp5);
		
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		session.save(pr1);
		session.save(pr2);
		session.save(pr3);
		
		transaction.commit();
		
		System.out.println("Records Added ");
		
		session.close();
		
	}

}
