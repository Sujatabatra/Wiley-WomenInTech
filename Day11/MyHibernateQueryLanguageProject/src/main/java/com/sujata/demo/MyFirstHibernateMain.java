package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class MyFirstHibernateMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		//For entire application one SessionFactory object : SessionFactory is SingleTon
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		//For every Transaction one Session object
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Query<Employee> query=session.createQuery("from Employee");
		List<Employee> empList=query.getResultList();
		empList.stream().forEach(System.out::println);
		
		System.out.println("=====================");
		
		Query query1=session.createQuery("select empId,empName from Employee");
		
		List<Object[][]> details=query1.getResultList();
		for(Object[] detail:details) {
			for(Object ele:detail) {
				System.out.print(ele+" ");
		}
		System.out.println("");
		}
		
		System.out.println("=========================");
		
		Query query2=session.createQuery("from Employee where department=:dep");
		System.out.println("Enter Department : ");
		String dept=sc.next();
		query2.setParameter("dep", dept);
		List<Employee> empList1=query2.getResultList();
		empList1.stream().forEach(System.out::println);

		System.out.println("===============================");
		
		Query query3=session.createQuery("delete from Employee where empName=:na");
		System.out.println("Enter employee name whoes record you want to delete : ");
		String name=sc.next();
		query3.setParameter("na", name);
		int rows=query3.executeUpdate();
		if(rows>0)
			System.out.println("Record Deleted ");
		else
			System.out.println("Record Not Deleted");
		
		transaction.commit();
		
		session.close();
	
	}

}
