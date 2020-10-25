package com.api.sportyshoes.service;

import java.util.List;

import com.api.sportyshoes.model.Admin;

public interface AdminService {
	public Admin createAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin getAdminById(int id);
	public void deleteAdminById(int id);
	public List<Admin> getAllAdmins();
	//public 

}
