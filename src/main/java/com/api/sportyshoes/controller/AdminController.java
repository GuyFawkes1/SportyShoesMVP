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

import com.api.sportyshoes.model.Admin;
import com.api.sportyshoes.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;

	@PostMapping("/admin")
	public Admin createProduct(@RequestBody Admin admin) {
		
		return service.createAdmin(admin);
		
	}

	@PutMapping("/admin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		
		return service.updateAdmin(admin);
		 
	}

	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable int id) {
		
		return service.getAdminById(id);
	}

	@DeleteMapping("/admin/{id}")
	public void deleteAdminById(@PathVariable int id) {
		service.deleteAdminById(id);
	}

	@GetMapping("/admins")
	public List<Admin> getAllAdmins() {

		return service.getAllAdmins();
	}


}
