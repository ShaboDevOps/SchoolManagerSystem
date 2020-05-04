package com.LeanTechtz.DAO;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Annoucement {
   
	@Id
	private Date date;
	private String contant;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContant() {
		return contant;
	}
	public void setContant(String contant) {
		this.contant = contant;
	}
	
	
}
