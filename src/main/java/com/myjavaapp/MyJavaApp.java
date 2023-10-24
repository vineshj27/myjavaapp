package com.myjavaapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyJavaApp {

	@GetMapping(path="/getname")
	public String getName() {
		return "Vinesh";
	}
	
	
}
