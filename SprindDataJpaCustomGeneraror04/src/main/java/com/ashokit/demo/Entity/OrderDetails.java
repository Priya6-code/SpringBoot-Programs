package com.ashokit.demo.Entity;

import java.util.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="Order_Details")
public class OrderDetails {
	
	@Id
	@Column(name="ORDER_ID")
	private String orderid;
	
	@Column(name="ORDER_BY")
	private String orderby;
	
	@Column(name="ORDER_PLACEDDATE")
	private Date orderplaceddate; 
	
	
	

}
