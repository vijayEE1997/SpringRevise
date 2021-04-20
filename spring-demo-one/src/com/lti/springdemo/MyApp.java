package com.lti.springdemo;

public class MyApp {
	public static void main(String[] args) {
		Coach coach=new TrackCoach(null);
		System.out.println(coach.getWorkout());
	}
}
