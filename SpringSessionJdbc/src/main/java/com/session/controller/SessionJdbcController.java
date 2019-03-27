package com.session.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.session.dao.ISessionDao;
import com.session.model.UserInfo;



@RestController
@EnableAutoConfiguration
@RequestMapping("/api/session")
public class SessionJdbcController {
	@Autowired
	ISessionDao dao;
	
	@RequestMapping(value="/users/{uname}", method=RequestMethod.GET, produces="application/json")
	public UserInfo  getUserInfo(@PathVariable String uname) {	
		return dao.getUserInfo(uname);
	}

}
