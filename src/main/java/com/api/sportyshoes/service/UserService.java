package com.api.sportyshoes.service;

import java.util.List;

import com.api.sportyshoes.model.User;

public interface UserService {

	public User createUser(User user);
	public User updateUser(User user);
	public User getUserById(int id);
	public void deleteUserById(int id);
	public List<User> getAllUsers();
	public List<User> getAllUsersByName(String name);
}
