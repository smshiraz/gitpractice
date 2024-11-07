package com.syed.gitpractise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class DemoController {
	
	
	@GetMapping("/sayhello")
	public String sayHello()
	{
		return "Hello from master";
	}
	
	@GetMapping("/sayhi")
	public String sayHi()
	{
		return "Hi from master";
	}

}
