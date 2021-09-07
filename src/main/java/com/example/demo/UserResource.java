package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	Message msg;
	
	@GetMapping("/hello")
	public String hello() {
		
		return msg.getMessage();
		//return "Hello World";
	}
}
