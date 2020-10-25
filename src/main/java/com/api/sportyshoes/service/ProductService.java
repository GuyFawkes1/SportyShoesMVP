package com.api.sportyshoes.service;

import java.util.List;

import com.api.sportyshoes.model.Product;

public interface ProductService {
	// Product Services
	public Product createProduct(Product product);
	public Product updateProduct(Product product);
	public Product getProductById(int id);
	public void deleteProductById(int id);
	public List<Product> getAllProducts();
	public List<Product> getAllProductsByCategory(String category);
	public List<Product> getAllProductsByName(String name);
	public List<Product> getAllProductsByManufacturer(String manufacturer);

	
	
}
