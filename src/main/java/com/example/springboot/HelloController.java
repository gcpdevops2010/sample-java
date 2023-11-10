package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	String CONSTANT="TEST";
	@GetMapping("/")
	public String index() {
		CONSTANT="TEST2";
		return "Greetings from Spring Boot!" ;
	}

}
