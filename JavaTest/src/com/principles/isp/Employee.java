package com.principles.isp;

public class Employee extends Human{
private String department;
	public Employee(String name) {
		super(name);
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " Name : " + getName() + 
					"\n Height : " + getHeight() +
					"\n Weight : " + getWeight();
		}
}
