package com.lti.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("coolFortuneService") // for differentiate similar beans
	private FortuneService fortuneService;// Field Injection or Reflection
	
//	public TennisCoach(FortuneService theFortuneService) {
//		this.fortuneService=theFortuneService;
//	}
	
	
//    @Autowired
//    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
//
//        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
//        
//        fortuneService = theFortuneService;
//    }
	
	
	
	// ANY METHOD WITH @Autowired can inject : MEthod Injection//
//	public void set(FortuneService theFortuneService) {
//	this.fortuneService=theFortuneService;
//}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play Tennis for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
