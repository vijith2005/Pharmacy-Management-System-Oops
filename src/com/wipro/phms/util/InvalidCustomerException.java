package com.wipro.phms.util;

public class InvalidCustomerException extends Exception {


	  public InvalidCustomerException() {
	        super("Invalid Customer: Customer ID not found!");
	    }

	    @Override
	    public String toString() {
	        return "InvalidCustomerException: Customer not registered in the system!";
	    }
}
