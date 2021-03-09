package com.sujata.demo;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class MyCriteriaQueryHibernateMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		//For entire application one SessionFactory object : SessionFactory is SingleTon
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		
		//For every Transaction one Session object
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
		
		CriteriaQuery<Employee> criteriaQuery=criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root=criteriaQuery.from(Employee.class);
		criteriaQuery.select(root);
		
		Query<Employee> query1=session.createQuery(criteriaQuery);
		List<Employee> empList1=query1.getResultList();
		
		empList1.stream().forEach(System.out::println);
		
		System.out.println("========================");

		//Deprecated
//		Criteria cri=session.createCriteria(Employee.class);
		
		CriteriaQuery<Object[]> criteriaQuery1=criteriaBuilder.createQuery(Object[].class);
		Root<Employee> root1=criteriaQuery1.from(Employee.class);
		criteriaQuery1.multiselect(root1.get("empId"),root1.get("empName"));
		
		Query<Object[]> query2=session.createQuery(criteriaQuery1);
		List<Object[]> details=query2.getResultList();
		
		for(Object[] detail:details) {
			System.out.println("id : "+detail[0]+" name: "+detail[1]);
		}
		
		System.out.println("=====================================");
		
		CriteriaQuery<Object[]> criteriaQuery2=criteriaBuilder.createQuery(Object[].class);
		Root<Employee> root2=criteriaQuery2.from(Employee.class);
		criteriaQuery2.multiselect(root2.get("empId"),root2.get("empName"));
		criteriaQuery2.where(criteriaBuilder.equal(root2.get("department"), "IT"));
		
		Query<Object[]> query3=session.createQuery(criteriaQuery2);
		List<Object[]> details1=query3.getResultList();
		
		for(Object[] detail:details1) {
			System.out.println("id : "+detail[0]+" name: "+detail[1]);
		}
		
		System.out.println("=====================================");
		transaction.commit();
		
		session.close();
	
	}

}
