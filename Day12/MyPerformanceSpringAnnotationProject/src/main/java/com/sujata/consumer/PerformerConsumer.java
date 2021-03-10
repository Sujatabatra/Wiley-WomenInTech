package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Performer;

public class PerformerConsumer {

	public static void main(String args[]) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("myperformer.xml");

		Performer performer4 = (Performer) springContainer.getBean("Swapna");

		performer4.perform();
		System.out.println("===================");

	}

}
