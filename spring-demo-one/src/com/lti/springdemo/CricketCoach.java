package com.lti.springdemo;

public class CricketCoach implements Coach {
	
	private String name;
	private int age;

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("Inside CrickeCoach Class");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getWorkout() {
		return "5 hours Fielding";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
