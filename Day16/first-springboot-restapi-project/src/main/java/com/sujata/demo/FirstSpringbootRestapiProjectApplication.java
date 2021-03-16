package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
public class FirstSpringbootRestapiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootRestapiProjectApplication.class, args);
	}

}
