package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerConsumer {

	public static void main(String args[]) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
		Performer performer1=(Performer)springContainer.getBean("Jincy");
		
		Performer performer2=(Performer)springContainer.getBean("Lina");
		
		Performer performer3=(Performer)springContainer.getBean("Gerardin");
		
		Performer performer4=(Performer)springContainer.getBean("Swapna");
		
		performer1.perform();
		System.out.println("===================");
		performer2.perform();
		System.out.println("===================");
		performer3.perform();
		System.out.println("===================");
		performer4.perform();
		System.out.println("===================");
		
		System.out.println("Performer 3: "+performer3);
		
		Performer performer5=(Performer)springContainer.getBean("Gerardin");
		
		System.out.println("Performer 5: "+performer5);
		
	}

}
