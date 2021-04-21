package com.lti.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CoolFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cool : You are Lucky to have me Today";
	}

}
