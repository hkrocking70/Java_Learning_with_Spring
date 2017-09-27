package com.lowes.learn.LearnSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lowes.beans.User;

@RestController
public class WelocmeController {
		
	@PostMapping("/discount/{sale}/{disc}")
	//@RequestMapping(value="/discount/{sale}/{disc}",method=RequestMethod.POST)
	String calcDiscount(@PathVariable("sale") int sales,@PathVariable("disc") float discount){
		return "Amount is : " + sales+(sales*discount)/100;
	}
	
	
	@RequestMapping("/getUser")
	User getUser(@RequestParam("uId") int userId){
		
		if(userId == 1){
			return new User(1,"XXX","XXX@hotmail.com","9999",null);
		}
		return new User(2,"XXXyyy","XXXyyy@hotmail.com","9922299",null);
	}
	
	
	@RequestMapping("/GreetMe")
	void GreetMe(){
		System.out.println("Hello GreetMe function");
	}
	
	@GetMapping("/hello")
	String greetUser(@RequestParam(value="uName",defaultValue="Lowes") String uName){
		return "Hello " + uName;
	}
}
