package com.example.demo;

public class UpiPayment implements IPayment {
	public UpiPayment() {
		System.out.println("Upi payment constructor");
	}
	public String pay(double amt) {
		
		//logic to check balance availability
		return "Payment successful through UpiPayment";
	}
}