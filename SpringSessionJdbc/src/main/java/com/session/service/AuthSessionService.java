package com.session.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.session.dao.ISessionDao;
import com.session.model.UserInfo;



@Service
public class AuthSessionService implements UserDetailsService{

	@Autowired
	private ISessionDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserInfo userInfo = dao.getUserInfo(username);
		GrantedAuthority authority = new SimpleGrantedAuthority(userInfo.getRole());
		UserDetails userDetails = (UserDetails)new User(userInfo.getuName(), 
				userInfo.getPassword(), Arrays.asList(authority));
		return userDetails;
	}

}
