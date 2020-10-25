package com.api.sportyshoes.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "purchase_records")
@Setter
@Getter

public class PurchaseRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseId;
	private int userId;
	private int productId;
	private String category;

	
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
}
