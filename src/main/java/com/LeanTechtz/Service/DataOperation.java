package com.LeanTechtz.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeanTechtz.DAO.Account;
import com.LeanTechtz.DAO.AccountInterface;
import com.LeanTechtz.DAO.Student;
import com.LeanTechtz.DAO.StudentInterface;
import com.LeanTechtz.DAO.Teacher;
import com.LeanTechtz.DAO.TeacherInterface;
import com.LeanTechtz.DAO.User;
import com.LeanTechtz.DAO.UserInterface;

@Service
public class DataOperation{
	
	@Autowired
	TeacherInterface teacherI;
	@Autowired
	StudentInterface studentI;
	@Autowired
	AccountInterface accInt;
	@Autowired
	UserInterface userInt;
	
	public void tchInsert(Teacher teacher) {
		
		teacherI.save(teacher);
	}

	public void stdInsert(Student student) {
	   studentI.save(student);
	}
	
	public void createAccount(Account account) {
		  accInt.save(account);
	}
	
	public void userInsert(User user) {
		userInt.save(user);
	}
	
	public Account findAccount(String username) {
		accInt.findByUsername(username);
		return new Account();
	}
	
}
