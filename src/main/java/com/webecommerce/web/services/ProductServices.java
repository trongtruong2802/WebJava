package com.webecommerce.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webecommerce.web.model.Product;
import com.webecommerce.web.repository.ProductRepository;

@Service
public class ProductServices {
    @Autowired
    private ProductRepository productrepository ;

    public List<Product> getAllproduct() {
		  return productrepository.findAll();
	}
    

}
