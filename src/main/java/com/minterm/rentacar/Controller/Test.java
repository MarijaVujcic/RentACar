package com.minterm.rentacar.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}