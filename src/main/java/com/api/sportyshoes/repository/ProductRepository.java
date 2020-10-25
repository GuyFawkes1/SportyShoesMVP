package com.api.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sportyshoes.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	public List<Product> findByCategory(String category);
	public List<Product> findByManufacturer(String manufacturer);

}
