package com.webecommerce.web.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webecommerce.web.model.Product;
import com.webecommerce.web.repository.ProductRepository;
import com.webecommerce.web.services.ProductServices;

@Service
public class ProductServicesimp implements ProductServices{
    @Autowired
    private ProductRepository productrepository ;
    
    @Override
    public List<Product> getAllproduct() {
		  return productrepository.findAll();
	}
    

}
