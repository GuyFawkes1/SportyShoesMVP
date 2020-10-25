package com.api.sportyshoes.service;

import java.util.Date;
import java.util.List;

import com.api.sportyshoes.model.PurchaseRecord;

public interface PurchaseRecordService {
	public PurchaseRecord createPurchaseRecord(PurchaseRecord purchaseRecord);
	public PurchaseRecord updatePurchaseRecord(PurchaseRecord purchaseRecord);
	public PurchaseRecord getPurchaseRecordById(int id);
	public void deletePurchaseRecordById(int id);
	public List<PurchaseRecord> getAllPurchaseRecords();
	public List<PurchaseRecord> getAllPurchaseRecordsByCategory(String category);
	public List<PurchaseRecord> getAllPurchaseRecordsByPurchaseDate(Date purchaseDate);

}
