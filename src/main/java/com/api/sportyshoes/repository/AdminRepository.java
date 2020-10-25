package com.api.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sportyshoes.model.Admin;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Integer>{
	
	public List<Admin> findByAdminUserName(String adminUserName);

}
