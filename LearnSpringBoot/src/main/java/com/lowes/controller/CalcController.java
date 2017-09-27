package com.lowes.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class CalcController {
	
	@RequestMapping(value="/add/{first}/{second}")
	String add(@PathVariable("first") int x,@PathVariable("second") int y){
		return "Sum is : " + (x+y);
	}
}
