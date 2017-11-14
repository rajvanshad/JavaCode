package com.principles.isp;

public class User {

	
	static void displayDetails(Human human){
		System.out.println(human);
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("Madhu");
		employee.setHeight(183);
		employee.setWeight(72);
		
		displayDetails(employee);
	}
	
}
