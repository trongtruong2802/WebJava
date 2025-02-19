package com.webecommerce.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webecommerce.web.model.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {

}
