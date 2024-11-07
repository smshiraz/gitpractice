package com.syed.gitpractise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class MyController {

	
	@GetMapping("/saypop")
	public String sayPop()
	{
		return "Pop from master";
	}
	
	@GetMapping("/sayghazal")
	public String sayGhazal()
	{
		return "Ghazal from master";
	}
	
	
}
