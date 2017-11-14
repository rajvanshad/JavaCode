package com.principles.srp.ocp;

public class User {

	public static void main(String[] args) {
		
		CustType customer1 = new CustType();
		customer1.createCustType(new Paid("Madhu",100));
		customer1.createCustType(new Free("Spoorthi",200));
		customer1.createCustType(new Gold("Eshanya",300));
		customer1.createCustType(new Gold("Eshanay",400));
		customer1.drawCustTypes();
		
	}

}
