package com.amol.pem.service;

import com.amol.pem.domain.User;

public interface UserService {

	public int userRegistration(User user);
	
	public  User logIn(String name);

}
