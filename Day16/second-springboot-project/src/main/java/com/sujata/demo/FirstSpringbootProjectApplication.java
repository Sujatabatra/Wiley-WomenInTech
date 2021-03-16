package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.producer.Performer;

//@SpringBootApplication : @Configuration + @ComponentScan
@SpringBootApplication(scanBasePackages = "com.sujata.producer") 
public class FirstSpringbootProjectApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("Lina")
	private Performer performer;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootProjectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		performer.perform();
		
	}

}
