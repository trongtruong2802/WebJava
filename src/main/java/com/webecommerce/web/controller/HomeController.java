package com.webecommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webecommerce.web.model.Product;
import com.webecommerce.web.services.ProductServices;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller

public class HomeController {

	@Autowired
	private ProductServices productservices;
	
	@GetMapping("/")
	public String home(Model m) {
		List<Product> product = productservices.getAllproduct();
        m.addAttribute("products", product);
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

	@GetMapping("/cart")
	public String cart(){
		return "cart";
	}
	
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	
	
	@GetMapping("/product_laptop")
	public String product_laptop() {
		return "product_laptop";
	}
}