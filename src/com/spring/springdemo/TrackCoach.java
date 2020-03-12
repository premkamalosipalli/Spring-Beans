package com.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	//Field Injection using 
	@Autowired
	private FortuneService fortuneService;
	
	//using AutoWired Annotation for dependency injection
	//no need of auto wired annotation if there is only one constructor in the implementation class
	//@Autowired
	/*public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	
	//Setter Injection for Auto Wired Annotation 
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "RUN 5km";
	}
	
	public int getDailyTime() {
		return 10;
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//add an init method
	public void doMyStartupstuff() {
		System.out.println("Start my init method");
	}
	
	//add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("this is my destroy method");
	}
	
	//creating a custom destroy dean for prototype scope
	public String destroy() {
		return fortuneService.destroy();
	}
}
