package com.session.dao;

import org.springframework.stereotype.Component;

import com.session.model.UserInfo;



@Component
public interface ISessionDao {
	public UserInfo getUserInfo(String uname);

}
