package com.webecommerce.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ID;
private int IDorder;
private String method;
private String Status;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getIDorder() {
	return IDorder;
}
public void setIDorder(int iDorder) {
	IDorder = iDorder;
}
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}

}
