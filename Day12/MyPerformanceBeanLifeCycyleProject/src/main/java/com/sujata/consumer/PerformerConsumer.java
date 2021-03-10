package com.sujata.consumer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.sujata.producer.Performer;

public class PerformerConsumer {

	public static void main(String args[]) {
		
		AbstractApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		
//		BeanFactory springContainer=new XmlBeanFactory(new ClassPathResource("performer.xml"));
		
		springContainer.registerShutdownHook();
		Performer performer1=(Performer)springContainer.getBean("Jincy");
		
		System.out.println("=================================");
//		performer1.perform();
		System.out.println("===============================");
		
		
	}

}
