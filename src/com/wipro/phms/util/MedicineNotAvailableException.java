package com.wipro.phms.util;

public class MedicineNotAvailableException  extends Exception{
	 public MedicineNotAvailableException() {
	        super("Medicine not available for purchase!");
	    }

	    @Override
	    public String toString() {
	        return "MedicineNotAvailableException: Medicine is expired, out of stock, or not found!";
	    }

}
