package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{

	private String song;
	private String singerName;
	public Singer() {
		System.out.println(" 1. Hi I am Singer Constructor");
	}

	public void setSong(String song) {
		System.out.println(" 2. Hi I am Singer setSong() method!");
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println(singerName+" is singing " + song + "!!!");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println(" 3. Hi i am setBeanName() method from BeanNameAware");
		singerName=name;
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(" 4. Hi I am setBeanFactory() from BeanFactoryAware interface");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(" 5. Hi I am setApplicationContext() from ApplicationContext");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" 7. Hi I am InitializingBean afterPropertySet() method");
		
	}

	public void customInit() {
		System.out.println(" 8. Hi I am custom init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("HI I am DisposableBean destroy() method");
		
	}

	public void customDestroy() {
		System.out.println("Hi I am custom destroy method");
	}
}
