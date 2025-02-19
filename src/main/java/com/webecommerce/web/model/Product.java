package com.webecommerce.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private double price;
private String image;
String introduce;

// Constructors
public Product() {}

public Product(String name, double price, String introduce, String image) {
    this.name = name;
    this.price = price;
    this.introduce = introduce;
    this.image = image;
}


public String getImage(){
    return image;
}
public void setImage(String image){
    this.image = image;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public String getIntroduce() {
    return introduce;
}
public void setIntroduce(String introduce) {
    this.introduce = introduce;
}
}
