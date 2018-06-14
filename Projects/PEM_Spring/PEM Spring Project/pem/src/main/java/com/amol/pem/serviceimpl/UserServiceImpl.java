package com.amol.pem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.pem.dao.UserDao;
import com.amol.pem.domain.User;
import com.amol.pem.service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userdao;

	public int userRegistration(User user) {
		
		return userdao.insertUser(user);
	}

	public User logIn(String name) {
		
		return userdao.logIn(name);
	}
	
	
}
