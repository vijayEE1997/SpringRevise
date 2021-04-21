package com.lti.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringConfig {

		public static void main(String[] args) {
			//Read the spring config file
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);		
			//get the bean
//			Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
			Coach theCoach = context.getBean("swimCoach",Coach.class);
			//call method
			System.out.println(theCoach.getDailyWorkout());
			System.out.println(theCoach.getDailyFortune());

	}

}
