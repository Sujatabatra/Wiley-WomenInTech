package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class GlobalInit implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
		System.out.println(" 6. Hi I am Pre - initialization Bean Post Processors "+beanName);
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException{
		System.out.println(" 9. Hi I am Post - initialization Bean Post Processors "+beanName);
		return bean;
	}
}
