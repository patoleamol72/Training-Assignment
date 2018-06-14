package com.amol.pem.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amol.pem.domain.User;

public class UserRowMapper implements RowMapper<User> {
	
	public User mapRow(ResultSet rs, int rowNum) throws SQLException{
		
			User user = new User();
			user.setUserid(rs.getInt(1));
		    user.setName(rs.getString(2));
		    user.setEmail(rs.getString(3));
		    user.setAddress(rs.getString(4));
		    user.setLoginName(rs.getString(5));
		    user.setPassword(rs.getString(6));
		    
		    return user;
	}

}
