package com.api.sportyshoes.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sportyshoes.model.PurchaseRecord;
import com.api.sportyshoes.repository.PurchaseRecordRepository;
import com.api.sportyshoes.service.PurchaseRecordService;

@Service
public class PurchaseRecordServiceImpl implements PurchaseRecordService {
	
	@Autowired
	private PurchaseRecordRepository purchaseRecordRepo;
	
	@Override
	public PurchaseRecord createPurchaseRecord(PurchaseRecord purchaseRecord) {
		return purchaseRecordRepo.save(purchaseRecord);
		
	}

	@Override
	public PurchaseRecord updatePurchaseRecord(PurchaseRecord purchaseRecord) {
		return purchaseRecordRepo.save(purchaseRecord);
		
	}

	@Override
	public PurchaseRecord getPurchaseRecordById(int id) {
		return purchaseRecordRepo.findById(id).get();
	}

	@Override
	public void deletePurchaseRecordById(int id) {
		
		purchaseRecordRepo.deleteById(id);
	}

	@Override
	public List<PurchaseRecord> getAllPurchaseRecords() {
		
		return purchaseRecordRepo.findAll();
	}

	@Override
	public List<PurchaseRecord> getAllPurchaseRecordsByCategory(String category) {
		return purchaseRecordRepo.findByCategory(category);
	}

	@Override
	public List<PurchaseRecord> getAllPurchaseRecordsByPurchaseDate(Date purchaseDate) {
		return purchaseRecordRepo.findByPurchaseDate(purchaseDate);
	}

}



