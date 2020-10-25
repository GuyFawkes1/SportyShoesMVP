package com.api.sportyshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sportyshoes.model.Admin;
import com.api.sportyshoes.repository.AdminRepository;
import com.api.sportyshoes.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepo;


	@Override
	public Admin createAdmin(Admin admin) {
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		admin.setAdminPassword(passwordEncoder.encode(admin.getAdminPassword()));
		return adminRepo.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		String hashedpassword = passwordEncoder.encode(admin.getAdminPassword());
//		admin.setAdminPassword(hashedpassword);
		return adminRepo.save(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		return adminRepo.findById(id).get();
	}

	@Override
	public void deleteAdminById(int id) {
		adminRepo.deleteById(id);
		
	}

	@Override
	public List<Admin> getAllAdmins() {
		return adminRepo.findAll();
	}
	
	
	
}


