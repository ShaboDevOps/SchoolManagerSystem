package com.LeanTechtz.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.LeanTechtz.DAO.Account;
import com.LeanTechtz.DAO.Student;
import com.LeanTechtz.DAO.StudentInterface;
import com.LeanTechtz.DAO.Teacher;
import com.LeanTechtz.DAO.TeacherInterface;
import com.LeanTechtz.DAO.User;
import com.LeanTechtz.Service.DataOperation;
import com.LeanTechtz.Service.ServiceClass;

@Controller
@Component
public class ControllerClass {
	
	@Autowired
	TeacherInterface tchI;
	@Autowired
	StudentInterface stdI;
	@Autowired
	ServiceClass service;
	@Autowired
	DataOperation dataop;
	
	@RequestMapping("/login")
	public ModelAndView login(Account account) {
		ModelAndView model = new ModelAndView();
    	model = service.loginauthorize(account);
		return model;		
	}
	
	                //CONTROLLERS FOR STUDENTS....
	@RequestMapping("/")
	public String home() {return "login.jsp";}
	
	@RequestMapping("/stdhome")
	public String stdhome() {return "stdhome.jsp";}
	
	@RequestMapping("/result")
	public String stdresult() {return "stdresult.jsp";}
	
	@RequestMapping("/viewttable")
	public String stdttable() {return "stdttable.jsp";}
	
	@RequestMapping("/stddetail")
	public String stddetail() {return "stddetail.jsp";}
	
	@RequestMapping("/changepassword")
	public String changepassword() {return "password.jsp";}
	
	@RequestMapping("/logout")
	public String logout() {return "login.jsp";}
	
	             
	                //CONTROLLERS FOR TEACHERS
	@RequestMapping("/tchhome")
	public String tchhome() {return "tchhome.jsp";}
	
	@RequestMapping("/viewresult")
	public String viewresult() {return "result.jsp";}
	
	@RequestMapping("/viewanoucement")
	public String viewanoucement() {return "annoucement.jsp";}
	
	@RequestMapping("/uploadmarks")
	public String uploadmarks() {return "tupload.jsp";}
	
	@RequestMapping("/tchdetail")
	public String tchdetail() {return "tchdetail.jsp";}
	

                   //ACADEMIC TEACHER CONTROLLERS
	@RequestMapping("/actchhome")
	public String actchhome() {return "actchhome.jsp";}
	
	              //SECOND MASTER CONTROLLERS
	@RequestMapping("/smhome")
	public String smhome() {return "smhome.jsp";}
	
	@RequestMapping("/smform1")
	public String smviewform1() {return "smviewstd1.jsp";}
	
	@RequestMapping("/smform2")
	public String smviewform2() {return "smviewstd2.jsp";}
	
	@RequestMapping("/smform3")
	public String smviewform3() {return "smviewstd3.jsp";}
	
	@RequestMapping("/smform4")
	public String smviewform4() {return "smviewstd4.jsp";}
	
	@RequestMapping("/stdregister")
	public String stdregister() {return "stdregistration.jsp";}
	

	@RequestMapping("/tchregister")
	public String tchregister() {return "tchregistration.jsp";}
	
	
	@RequestMapping("/smviewteachers")
	public String smviewteachers() {return "smviewtch.jsp";}
	
	@RequestMapping("/registertch")
	public String registertch(Teacher teacher) {
		    Account account = new Account();
		    User user = new User();
		    service.asignID(teacher);
		    account = service.setAccount(teacher);
		    user = service.setUsers(teacher);
		    dataop.tchInsert(teacher);
		    dataop.createAccount(account);
		    dataop.userInsert(user);
		return "tchregistration.jsp";
		}
	
	@RequestMapping("/registerstd")
	public String registerstd(Student student){ 
		  Account account = new Account();
		  User user = new User();
		  service.asignID(student);
		  account =  service.setAccount(student);
		  user = service.setUsers(student);
		  dataop.stdInsert(student);
		  dataop.createAccount(account);
		  dataop.userInsert(user);
		return "stdregistration.jsp";
		}
	

    //HEAD MASTER CONTROLLERS
    @RequestMapping("/hmhome")
    public String hmhome() {return "hmhome.jsp";}

    @RequestMapping("/hmform1")
    public String viewform1() {return "viewstd1.jsp";}

    @RequestMapping("/hmform2")
    public String viewform2() {return "viewstd2.jsp";}

    @RequestMapping("/hmform3")
    public String viewform3() {return "viewstd3.jsp";}

    @RequestMapping("/hmform4")
    public String viewform4() {return "viewstd4.jsp";}

    @RequestMapping("/hmviewteachers")
    public String viewteachers() {return "viewtch.jsp";}

}
