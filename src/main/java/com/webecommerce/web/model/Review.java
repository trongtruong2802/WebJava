package com.webecommerce.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ID;
private int IDproduct;
private int IDuser;
private String content;
private int evaluate;
private String Date;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getIDproduct() {
	return IDproduct;
}
public void setIDproduct(int iDproduct) {
	IDproduct = iDproduct;
}
public int getIDuser() {
	return IDuser;
}
public void setIDuser(int iDuser) {
	IDuser = iDuser;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public int getEvaluate() {
	return evaluate;
}
public void setEvaluate(int evaluate) {
	this.evaluate = evaluate;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}


}
