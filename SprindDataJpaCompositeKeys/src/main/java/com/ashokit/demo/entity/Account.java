package com.ashokit.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="BANK_ACCOUNTS")
public class Account {
	
	@Column(name = "BRANCH_NAME")
	private String branchname;
	
	@Column(name = "MIN_BAL")
	private double minbal;
	
	@EmbeddedId
     private AccountPk accpk; 
	
	

}
