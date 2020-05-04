package com.LeanTechtz.DAO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	
	@Id
	private String subjctname;
	
	@ManyToOne
	private Teacher teacher;
	
	@ManyToMany
	private List<Student> student;
	
	private String form;
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public String getSubjctname() {
		return subjctname;
	}
	public void setSubjctname(String subjctname) {
		this.subjctname = subjctname;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
