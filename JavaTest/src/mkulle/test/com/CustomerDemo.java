package mkulle.test.com;

import mkulle.test.com.Customer.CustType;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomerName("Madhu");
		customer.setAmount(100);
		customer.setCustomerType(CustType.Paid); 
		//customer.discount();
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getAmount());  
		System.out.println(customer.getCustomerType());
		System.out.println(customer.discount());
		//System.out.println("Madhu Kullegowda");
		
	}

}
