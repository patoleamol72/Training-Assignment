package com.amol.pem.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amol.pem.dao.UserDao;
import com.amol.pem.domain.User;
import com.amol.pem.rowmapper.UserRowMapper;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

@Repository("userdao")
public class UserDaoImpl implements UserDao {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertUser(User user) {
		String sql = "insert into users(name,email,address,loginName,password) values(?,?,?,?,?)";
		System.out.println(user.getName());
		
		int i = jdbcTemplate.update(sql, new Object[] {user.getName(),user.getEmail(),user.getAddress(),user.getLoginName(),user.getPassword()});
		if(i>0) {
			return i;
		}
		return 0;
	}

	public void deleteUser(int userid) {
		// TODO Auto-generated method stub
		
	}

	public void editUser(User user) {
		// TODO Auto-generated method stub
		
	}


	public User logIn(String name) {
		String sql=null;
		User user = null;
		
			
				sql = "select * from users where loginName = ? ";
				user = new User();
				user=jdbcTemplate.queryForObject(sql, new UserRowMapper(), name);
			
			return user;
	}


	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
