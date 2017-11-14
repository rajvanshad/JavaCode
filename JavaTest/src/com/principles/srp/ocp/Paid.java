package com.principles.srp.ocp;

public class Paid extends Customer{
			public Paid(String customerName, double amount) {
		super(customerName, amount);
		// TODO Auto-generated constructor stub
	}

	public void discount() {
		
		System.out.println("Paid - Discount Amount : " + amount * 0.1);
	}



}

