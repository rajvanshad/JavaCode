package mkulle.test.com;

public class Customer {

	private String CustomerName;
	private double amount;
	private CustType CustomerType;
	public enum CustType{
		Free,
		Paid,
	}
	
	public String getCustomerName() {
		return CustomerName;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public double discount() {
		
		if(CustomerType == CustType.Free) {
			return 0;
		}
		return amount * 0.1;
		
	}


	public CustType getCustomerType() {
		return CustomerType;
	}


	public void setCustomerType(CustType customerType) {
		CustomerType = customerType;
	}
	
	
}
