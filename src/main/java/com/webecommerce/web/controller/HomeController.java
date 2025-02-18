package com.webecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String register() {
		return "signup";
	}
	@GetMapping("/products")
	public String products() {
		return "product";
	}
	@GetMapping("/view_product")
	public String getMethodName() {
		return "view_product";
	}
	
	
}