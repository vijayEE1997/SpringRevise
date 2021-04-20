package com.lti.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach = context.getBean("myCoach",CricketCoach.class);
		
	    System.out.println(theCoach.getWorkout());
	    System.out.println(theCoach.getDailyFortune());
	    System.out.println(theCoach.getName()+" "+theCoach.getAge());
	    context.close();

	}

}
