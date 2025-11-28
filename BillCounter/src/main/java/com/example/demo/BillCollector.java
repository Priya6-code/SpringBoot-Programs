package com.example.demo;

public class BillCollector {

    private IPayment payment;
    public void setPayment(IPayment payment) {
    	System.out.println("Set payment executed");
        this.payment = payment;
    }

    public BillCollector(IPayment payment) {
        this.payment = payment;
        System.out.println("Constructor got executed");
    }

    
    public void collectPayment(double amt) {
        String status = payment.pay(amt);
        System.out.println(status);
    }

    
}
