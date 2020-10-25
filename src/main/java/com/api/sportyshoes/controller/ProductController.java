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

import com.api.sportyshoes.model.Product;
import com.api.sportyshoes.service.ProductService;

@RestController
public class ProductController  {

	@Autowired
	private ProductService service;

	@PostMapping("/admin/product")
	public Product createProduct(@RequestBody Product product) {
		
		return service.createProduct(product);
		
	}

	@PutMapping("/admin/product")
	public Product updateProduct(@RequestBody Product product) {
		
		return service.updateProduct(product);
		 
	}

	@GetMapping("/admin/product/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return service.getProductById(id);
	}

	@DeleteMapping("/admin/product/{id}")
	public void deleteProductById(@PathVariable int id) {
		service.deleteProductById(id);
	}

	@GetMapping("/admin/products")
	public List<Product> getAllProducts() {

		return service.getAllProducts();
	}

	@GetMapping("/admin/products/category/{category}")
	public List<Product> getAllProductsByCategory(@PathVariable String category) {

		return service.getAllProductsByCategory(category);
	}

//
//	public List<Product> getAllProductsByName(String name) {
//		return service.getAllProductsByName(name);
//	}

	@GetMapping("/admin/products/manufacturer/{manufacturer}")
	public List<Product> getAllProductsByManufacturer(@PathVariable String manufacturer) {
		
		return service.getAllProductsByManufacturer(manufacturer);
	}
	
}
