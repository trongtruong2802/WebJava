package com.webecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AdminController {
    @GetMapping("/admin")
    public String admin() {
        return "/admin/admin";
    }
    @GetMapping("/product")
    public String product() {
        return "/admin/add_product";
    }
    @GetMapping("/category")
    public String category() {
        return "/admin/category";
    }
    @GetMapping("/index")
    public String index() {
        return "/admin/index";
    }
}
