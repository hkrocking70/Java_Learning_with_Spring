package com.lowes.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetController {
	
	@RequestMapping("/greet")
	public static void Greet(){
		System.out.println("Welcome to Spring");
	}
	
	@RequestMapping("/person")
	public String GreetPerson(){
		return "person";
	}

}
