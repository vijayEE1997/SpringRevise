package com.lti.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Repeat;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String showForm() {
		return "helloworld-form";
	}
	@RequestMapping("/helloS")
	public String showForm1() {
		return "helloworld";
	}
}
