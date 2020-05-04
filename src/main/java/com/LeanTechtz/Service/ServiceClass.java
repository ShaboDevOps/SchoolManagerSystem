package com.LeanTechtz.Service;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import com.LeanTechtz.DAO.Account;
import com.LeanTechtz.DAO.Student;
import com.LeanTechtz.DAO.Teacher;
import com.LeanTechtz.DAO.User;

@Component
public class ServiceClass {

	//Created on april 14 2020,
	//to select accounts.
	public ModelAndView loginauthorize(Account account) {
        
		ModelAndView model = new ModelAndView();
	     char firstchar = account.getUsername().charAt(0);
	     
	     if (firstchar=='t') {model.setViewName("tchhome.jsp");}
	     else if (firstchar=='s') {model.setViewName("stdhome.jsp");}
	     else if (firstchar=='a') {model.setViewName("actchhome.jsp");}
	     else if (firstchar=='v') {model.setViewName("smhome.jsp");}
	     else if (firstchar=='h') { model.setViewName("hmhome.jsp");}
		return model;	
	}
	
	//created on april 18 2020
	// to asign ID
	public Teacher asignID(Teacher teacher){
		String year = teacher.getYear();
		String tchId = "t."+year;
		teacher.setTchID(tchId);
		return teacher;
	}
	
    public Student asignID(Student student){
    	String year = student.getYear();
    	String stdId = "s."+year;
    	student.setStdntID(stdId);
    	return student;
		
	}
    
    //created on april 21 2020
    //to create users and  accounts
    public Account setAccount(Student student) {
    	Account account = new Account();
    	account.setUsername(student.getStdntID());
    	account.setPassword(student.getMiddlename().toUpperCase());
    	account.setCategory("STUDENT");
    	return account;
    	
    }
    
    public Account setAccount(Teacher teacher) {
    	Account account = new Account();
    	account.setUsername(teacher.getTchID());
    	account.setPassword(teacher.getMiddlename().toUpperCase());
    	account.setCategory("TEACHER");
    	return account;
    	
    }
    
    public User setUsers(Student student) {
    	User user = new User();
    	user.setName(student.getFirstname().toUpperCase()+"  "+student.getLastname().toUpperCase());
    	user.setCategory("STUDENT");
    	return user;
    	
    }
    public User setUsers(Teacher teacher) {
    	User user = new User();
    	user.setName(teacher.getFirstname().toUpperCase()+"  "+teacher.getLastname().toUpperCase());
    	user.setCategory("TEACHER");
    	return user;
    	
    }
}
