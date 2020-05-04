package com.LeanTechtz.DAO;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TODTtable {

	@Id
	private Long number;
	
	@ManyToMany
	private List<Teacher> teacher;
	public Long getNumber() {
		return number;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	private Date date;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
