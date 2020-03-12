package com.spring.springdemo;

public class CircketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CircketCoach() {
		System.out.println("Constructor for circketcoach");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Constructor for setcircketcoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "play in the morning";
	}

	@Override
	public int getDailyTime() {
		// TODO Auto-generated method stub
		return 20;
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
