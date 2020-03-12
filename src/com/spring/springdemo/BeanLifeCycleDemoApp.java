package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");
		
		//retrieve bean from the Spring
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		System.out.println("MemoryLocation to the Coach:"+theCoach);

		
		//for prototype scope the destroy dean is not called
		Coach theCoach1=context.getBean("myCustomCoach", Coach.class);
		System.out.println("MemoryLocation to the Coach:"+theCoach1);
		System.out.println(theCoach1.destroy());
		context.close();
	}

}
