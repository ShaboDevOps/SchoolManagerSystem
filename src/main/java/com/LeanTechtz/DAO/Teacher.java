package com.LeanTechtz.DAO;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Teacher {

	@Id
	private String tchID;
	private String firstname,
                    middlename,
                    lastname,
                    gender,
                    subjects,
                    year;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@OneToMany(mappedBy = "teacher")
	private List<Subject> subject;
	
	public String getSubjects() {
		return subjects;
	}
	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
	public List<TODTtable> getTimetable() {
		return timetable;
	}
	public void setTimetable(List<TODTtable> timetable) {
		this.timetable = timetable;
	}
	@ManyToMany(mappedBy = "teacher")
	private List<TODTtable> timetable;
	public String getTchID() {
		return tchID;
	}
	public void setTchID(String tchID) {
		this.tchID = tchID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
}
