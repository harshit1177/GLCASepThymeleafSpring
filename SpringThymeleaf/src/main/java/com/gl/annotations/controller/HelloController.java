package com.gl.annotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //spring mvc
//Controller - RestController // restApIs and not the ui (@controller and Response Body) 
public class HelloController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "views/hello-world";
	}
	
}
