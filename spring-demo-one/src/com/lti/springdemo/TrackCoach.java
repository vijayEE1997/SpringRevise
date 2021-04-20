package com.lti.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30min on Track";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
