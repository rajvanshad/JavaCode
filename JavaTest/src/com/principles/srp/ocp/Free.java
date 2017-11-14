package com.principles.srp.ocp;

public class Free extends Customer {

	public Free(String customerName, double amount) {
		super(customerName, amount);
	}

	@Override
	public void discount() {
		System.out.println("Free - Discount Amount : " +  0);
		
	}

}
