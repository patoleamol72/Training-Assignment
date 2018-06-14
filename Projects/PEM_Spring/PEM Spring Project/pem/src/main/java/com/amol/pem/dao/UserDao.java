package com.amol.pem.dao;

import java.util.List;

import com.amol.pem.domain.User;

public interface UserDao {
	public int insertUser(User user);
	public void deleteUser(int userid);
	public void editUser(User user);
	public List<User> getAllUsers();
	
	public  User logIn(String name);

}
