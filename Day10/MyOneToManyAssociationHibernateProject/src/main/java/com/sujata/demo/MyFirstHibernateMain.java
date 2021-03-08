package com.sujata.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sujata.bean.Department;
import com.sujata.bean.Employee;


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
		
		Department dep1=new Department("D001", "Sales");
		Department dep2=new Department("D002", "IT");
		Department dep3=new Department("D003", "Marketing");
		
		emp1.setDepartment(dep1);
		emp2.setDepartment(dep2);
		emp3.setDepartment(dep3);
		emp4.setDepartment(dep1);
		emp5.setDepartment(dep2);
		

		dep1.getEmployees().add(emp1);
		dep1.getEmployees().add(emp4);
		
		dep2.getEmployees().add(emp2);
		dep2.getEmployees().add(emp5);
		
		dep3.getEmployees().add(emp3);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		session.save(dep1);
		session.save(dep2);
		session.save(dep3);
		
		transaction.commit();
		
		System.out.println("Records Added ");
		
		session.close();
		
	}

}
