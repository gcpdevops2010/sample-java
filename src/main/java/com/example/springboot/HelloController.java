package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	String CONSTANT="TEST";
	@GetMapping("/")
	public String index() {
		String name1 = "This is test";
		String name2 = "This is test";
		String name3 = "This is test";
		
		CONSTANT="TEST2";
		return "Greetings from Spring Boot!" + name1 + name2 + name3 ;
	}

}
