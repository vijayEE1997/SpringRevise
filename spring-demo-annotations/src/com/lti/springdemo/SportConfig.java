package com.lti.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  // just like xml
//@ComponentScan("com.lti.springdemo") //component scan
@PropertySource("classpath:")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
		}

}
