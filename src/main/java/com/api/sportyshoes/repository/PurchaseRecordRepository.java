package com.api.sportyshoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.sportyshoes.model.PurchaseRecord;

@Repository
public interface PurchaseRecordRepository extends JpaRepository<PurchaseRecord, Integer> {
	
	public List<PurchaseRecord> findByPurchaseDate(Date purchaseDate);
	public List<PurchaseRecord> findByCategory(String category);

}
