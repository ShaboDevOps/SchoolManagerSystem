//package com.LeanTechtz.Security;
//import java.util.Collection;
//import java.util.Collections;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.LeanTechtz.DAO.Account;
//
//public class MyUserDetails implements UserDetails {
//
//	private Account account;
//	public MyUserDetails(Account account) {
//		this.account = account;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		
//		return Collections.singleton(new SimpleGrantedAuthority("user"));
//	}
//
//	@Override
//	public String getPassword() {
//		
//		return account.getPassword();
//	}
//
//	@Override
//	public String getUsername() {
//		
//		return account.getUsername();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//}
