package com.wipro.phms.entity;

public class Customer {
    
	private String customerId ;
	private String customerName;
	private String contactNumber; 	
	
	
	public Customer() {}
	public Customer(String customerId , String customerName , String contactNumber) {
		this.contactNumber = contactNumber ;
		this.customerId = customerId;
		this.customerName = customerName ;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + "]";
	}

	 
	
}
