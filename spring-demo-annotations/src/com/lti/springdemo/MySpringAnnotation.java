package com.lti.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringAnnotation {

	public static void main(String[] args) {
		//Read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		//get the bean
//		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//call method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
