package com.principles.srp.ocp;

public class Gold extends Customer {

	public Gold(String customerName, double amount) {
		super(customerName, amount);
	}

	@Override
	public void discount() {
		System.out.println("Gold - Discount Amount : " +  amount * 0.2);		
	}

}
