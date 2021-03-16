package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Performer;

//@SpringBootApplication : @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata.producer") 
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(FirstSpringbootProjectApplication.class, args);
		
		Performer p1=(Performer)springContainer.getBean("Lina");
		p1.perform();
	}

}
