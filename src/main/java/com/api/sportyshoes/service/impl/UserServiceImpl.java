package com.api.sportyshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sportyshoes.model.User;
import com.api.sportyshoes.repository.UserRepository;
import com.api.sportyshoes.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public User getUserById(int id) {
		return userRepo.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
		
	}

	@Override
	public List<User> getAllUsersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
