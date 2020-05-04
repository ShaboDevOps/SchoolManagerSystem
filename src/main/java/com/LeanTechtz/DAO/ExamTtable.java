package com.LeanTechtz.DAO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ExamTtable {

	@Id
	private String form;
	@OneToOne
	private Subject subject;
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
