package com.webecommerce.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ID;

private int IDuser;

private String Date;

private Double Total;

private String Status;

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public int getIDuser() {
	return IDuser;
}

public void setIDuser(int iDuser) {
	IDuser = iDuser;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public Double getTotal() {
	return Total;
}

public void setTotal(Double total) {
	Total = total;
}

public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
}


}
