package com.api.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sportyshoes.model.User;
import com.api.sportyshoes.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		
		return service.createUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@GetMapping("/admin/user/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}


	@DeleteMapping("/admin/user/{id}")
	public void deleteUserById(@PathVariable int id) {
		service.deleteUserById(id);
		
	}


	@GetMapping("/admin/users")
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

//	@GetMapping("/admin/users/{name}")
//	public List<User> getAllUsersByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
