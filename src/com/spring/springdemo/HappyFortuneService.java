package com.spring.springdemo;

public class HappyFortuneService implements FortuneService{
	
	public String getFortune() {
		return "Today is your lucky day";
	}
	
	public String destroy() {
		return "this is custom destroy";
	}

}
