//package com.LeanTechtz.Security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityClass extends WebSecurityConfigurerAdapter{
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		 http.csrf().disable() .authorizeRequests() 
//		 .anyRequest().authenticated().and()
//		 .formLogin(); 
//								 /* .loginPage("/").permitAll() .and() .logout().invalidateHttpSession(true)
//								 * .clearAuthentication(true) .logoutRequestMatcher(new
//								 * AntPathRequestMatcher("/logout")) .logoutSuccessUrl("/").permitAll();
//								 */
//	}
//	@Bean
//	public AuthenticationProvider authProvider() {
//		
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setUserDetailsService(userDetailsService);
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
//		return provider;
//		
//	}
//	
//}
