package com.lti.springdemo;

import org.springframework.stereotype.Component;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Bad Day!!!!";
	}

}
