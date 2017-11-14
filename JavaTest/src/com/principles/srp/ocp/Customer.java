package com.principles.srp.ocp;

public abstract class Customer {

	String customerName;
	double amount;	
	public Customer(String customerName, double amount) {
		this.customerName = customerName;
		this.amount = amount;
	}
	public abstract void discount();
	
}
