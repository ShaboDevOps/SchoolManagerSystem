package com.LeanTechtz.DAO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq", allocationSize = 1000)
public class User {
 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@Id
	private int number;
	private String name;
	private String category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	   
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
	
	
}
