package com.example.demo;

public class CreditCardPayment implements IPayment {

	
	public CreditCardPayment() {
		System.out.println("Credit card constructor");
	}
	public String pay(double amt) {
		
		//logic to check balance availability
		return "Payment successful through CreditCard";
	}
}
