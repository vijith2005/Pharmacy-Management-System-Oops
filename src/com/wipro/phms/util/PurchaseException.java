package com.wipro.phms.util;

public class PurchaseException extends Exception	 {

	 public PurchaseException() {
	        super("Failed to process purchase!");
	    }

	    @Override
	    public String toString() {
	        return "PurchaseException: Invalid purchase operation!";
	    }
	

}
