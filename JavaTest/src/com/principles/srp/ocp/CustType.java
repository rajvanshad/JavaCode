package com.principles.srp.ocp;

import java.util.ArrayList;
import java.util.List;

public class CustType {

	List<Customer> custTypes = new ArrayList<Customer>();
	
	public void createCustType(Customer custType) {
		custTypes.add(custType);
	}
	
	public void drawCustTypes() {
		for (Customer cust : custTypes) {
			cust.discount();			
		}
	}
	
	
}
