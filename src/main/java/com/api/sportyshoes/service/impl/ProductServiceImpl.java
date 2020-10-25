package com.api.sportyshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sportyshoes.model.Product;
import com.api.sportyshoes.repository.ProductRepository;
import com.api.sportyshoes.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	public Product createProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public Product getProductById(int id) {
		
//		Product product=null;
//		try {
//			if(id<=0) {
//				throw new BusinessException("Id cannot be zero or negative");
//			}
//		product=productRepo.findById(id).get();
//		}catch(NoSuchElementException e) {
//			throw new BusinessException("No SuperHero found with id = "+id);
//		}
//		return product;
		
		return productRepo.findById(id).get();
	}

	@Override
	public void deleteProductById(int id) {
		
		productRepo.deleteById(id);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		
		return productRepo.findByCategory(category);
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductsByManufacturer(String manufacturer) {
		
		return productRepo.findByManufacturer(manufacturer);
	}
}
	
	