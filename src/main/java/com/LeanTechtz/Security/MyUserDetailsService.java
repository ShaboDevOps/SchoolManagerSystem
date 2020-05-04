//package com.LeanTechtz.Security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.LeanTechtz.DAO.Account;
//import com.LeanTechtz.Service.DataOperation;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//	
//	@Autowired
//	private DataOperation dataOp;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	
//		Account account = dataOp.findAccount(username);
//		if(username == null)
//			throw new UsernameNotFoundException(username+"\tNOT FOUND");
//		
//		return new MyUserDetails(account);
//	}
//
//}
