package com.wipro.phms.util;

public class InvalidCustomerException extends Exception {


	    @Override
	    public String toString() {
	        return "InvalidCustomerException: Customer not registered in the system!";
	    }
}
