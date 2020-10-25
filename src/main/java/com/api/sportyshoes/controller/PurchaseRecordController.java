package com.api.sportyshoes.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sportyshoes.model.PurchaseRecord;
import com.api.sportyshoes.service.PurchaseRecordService;

@RestController
public class PurchaseRecordController  {

	@Autowired
	private PurchaseRecordService service;

	@PostMapping("/admin/purchaseRecord")
	public PurchaseRecord createPurchaseRecord(@RequestBody PurchaseRecord purchaseRecord) {
		
		
		return service.createPurchaseRecord(purchaseRecord);
	}

	@PutMapping("/admin/purchaseRecord")
	public PurchaseRecord updatePurchaseRecord(@RequestBody PurchaseRecord purchaseRecord) {
		return service.updatePurchaseRecord(purchaseRecord);
	}

	@GetMapping("/admin/purchaseRecord/{id}")
	public PurchaseRecord getPurchaseRecordById(@PathVariable int id) {
		return service.getPurchaseRecordById(id);
	}


	@DeleteMapping("/admin/purchaseRecord/{id}")
	public void deletePurchaseRecordById(@PathVariable int id) {
		service.deletePurchaseRecordById(id);
	}


	@GetMapping("/admin/purchaseRecords")
	public List<PurchaseRecord> getAllPurchaseRecords() {
		
		return service.getAllPurchaseRecords();
	}


	@GetMapping("/admin/purchaseRecords/category/{category}")
	public List<PurchaseRecord> getAllPurchaseRecordsByCategory(@PathVariable String category) {
		return service.getAllPurchaseRecordsByCategory(category);
	}

	@GetMapping("/admin/purchaseRecords/purchaseDate/{purchaseDate}")
	public List<PurchaseRecord> getAllPurchaseRecordsByDate(@PathVariable Date purchaseDate) {
		return service.getAllPurchaseRecordsByPurchaseDate(purchaseDate);
	}
	
	
}
