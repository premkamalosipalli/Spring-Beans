package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		
		//retrieve bean from the Spring
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		Coach theCoach1=context.getBean("myCoach", Coach.class);
		
		boolean result=(theCoach==theCoach1);
		
		System.out.println(result);
		System.out.println("MemoryLocation the the Coach:"+theCoach);
		System.out.println("MemoryLocation to the Coach1:"+theCoach1);
		context.close();
	}

}
