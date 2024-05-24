package com.teky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String homeControllerHandler()
	{
		return "THIS IS HOME CONTROLLER";
	}
	
	@GetMapping("/home")
	public String homeControllerHandler2()
	{
		return "THIS IS HOME CONTROLLER2";
	}

}
