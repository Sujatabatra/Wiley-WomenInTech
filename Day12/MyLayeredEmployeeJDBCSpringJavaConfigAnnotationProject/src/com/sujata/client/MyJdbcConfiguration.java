package com.sujata.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.dao.EmployeeDaoImp;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.sujata") //looks for classes annotated with @Component,@Repository and @Service in com.sujata package and its sub package and runs their life cycle
public class MyJdbcConfiguration {

//	@Bean(name = "dao")
//	public EmployeeDaoImp dao() {
//		return new EmployeeDaoImp();
//	}
//	
//	@Bean(name="service")
//	public EmployeeServiceImpl service() {
//		EmployeeServiceImpl serviceImpl=new EmployeeServiceImpl();
//		serviceImpl.setEmpDao(dao());
//		return serviceImpl;
//	}
//	
//	@Bean(name="presentation")
//	public EmployeePresentationImpl presentation() {
//		EmployeePresentationImpl presentation=new EmployeePresentationImpl();
//		presentation.setEmpService(service());
//		return presentation;
//	}
	
	
}
