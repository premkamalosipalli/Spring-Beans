package com.spring.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	public String getDailyWorkout(){
		return "spend 30 minutes on batting practice";
	}
	
	public int getDailyTime() {
		return 20;
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService 
		return fortuneService.getFortune();
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String destroy() {
		// TODO Auto-generated method stub
		return null;
	}
}
