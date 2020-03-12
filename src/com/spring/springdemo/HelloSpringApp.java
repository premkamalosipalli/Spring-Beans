package com.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//retrieve bean from spring container
		
		FortuneService theFortune=context.getBean("myRandomCoach", FortuneService.class);
		//CircketCoach theCircketCoach=context.getBean("myCircketCoach", CircketCoach.class);
		//Coach theCoach=context.getBean("myCoach", Coach.class);
		//Coach theCoach1=context.getBean("myCoach1", Coach.class);
		
		//call methods on the bean
		System.out.println(theFortune.getFortune());
		/*System.out.println(theCircketCoach.getDailyFortune());
		System.out.println(theCircketCoach.getEmail());
		System.out.println(theCircketCoach.getTeam());
		System.out.println(theCircketCoach.getDailyWorkout());
		System.out.println(theCircketCoach.getDailyTime());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyTime());
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyTime());*/
		
		//close the context
		context.close();
	}

}
