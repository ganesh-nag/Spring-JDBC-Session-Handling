package com.session.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.session.dao.ISessionDao;
import com.session.model.UserInfo;

@Service
public class UserSessionDaoImpl implements ISessionDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public UserInfo getUserInfo(String uname) {

		String sql = "SELECT u.USERNAME, u.PASSWORD, a.ROLE FROM "+
			     "USERS u INNER JOIN USER_ROLES a on u.USERNAME=a.USERNAME WHERE "+
			     "u.ENABLED ='Y' and u.USERNAME =" + "'" + uname + "'";
		
		return jdbcTemplate.query(sql, new ResultSetExtractor<UserInfo>() {
			 
	        public UserInfo extractData(ResultSet rs) throws SQLException,
	                DataAccessException {
	            if (rs.next()) {
	                UserInfo userInfo = new UserInfo();
	                userInfo.setuName(rs.getString("USERNAME"));
	                userInfo.setPassword(rs.getString("PASSWORD"));
	                userInfo.setRole(rs.getString("ROLE"));
	               
	                return userInfo;
	            }
	 
	            return null;
	        }
	 
	    });


		
	}
	
}
