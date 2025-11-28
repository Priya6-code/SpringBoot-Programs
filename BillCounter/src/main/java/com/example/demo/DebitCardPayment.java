package com.example.demo;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("Debit card constructor");
	}
	public String pay(double amt) {
		
		//logic to check balance availability
		return "Payment successful through DebitCard";
	}

}
