package com.webecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/admin")

public class AdminController {

    
    //localhost:5000/admin
    @GetMapping("")
    public String admin() {
        return "admin/indexAdmin";
    }
    //localhost:5000/admin/add_product
    @GetMapping("/add_product")
    public String product() {
        return "/admin/add_product";
    }
    //localhost:5000/admin/category
    @GetMapping("/category")
    public String category() {
        return "/admin/category";
    }
    
    @GetMapping("/orderAdmin")
    public String orderAdmin() {
        return "/admin/orderAdmin";
    }


    @GetMapping("/user")
    public String user() {
        return "/admin/user";
    }
    
    
    
}
