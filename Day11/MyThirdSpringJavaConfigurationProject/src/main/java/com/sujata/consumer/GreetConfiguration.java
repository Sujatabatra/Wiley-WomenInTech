package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.GoodEvening;
import com.sujata.producer.GoodMorning;
import com.sujata.producer.Welcome;

@Configuration
public class GreetConfiguration {

	@Bean(name = "mrng")
	public GoodMorning getMrng() {
		return new GoodMorning("Lina");
	}
	
	@Bean(name = "eve")
	public GoodEvening getEve() {
		GoodEvening ge=new GoodEvening();
		ge.setName("Anjali");
		return ge;
	}
	
	@Bean(name="welcomeInMrng")
	public Welcome welcomeMorning() {
		return new Welcome(getMrng());
	}
	
	@Bean(name="welcomeInEve")
	public Welcome welcomeEvening() {
		return new Welcome(getEve());
	}
	
	
}
