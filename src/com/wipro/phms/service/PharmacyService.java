package com.wipro.phms.service;

import java.util.ArrayList;

import com.wipro.phms.entity.Customer;
import com.wipro.phms.entity.Medicine;
import com.wipro.phms.entity.Purchase;
import com.wipro.phms.util.InvalidCustomerException;
import com.wipro.phms.util.MedicineNotAvailableException;
import com.wipro.phms.util.PurchaseException;

public class PharmacyService {
      public ArrayList<Customer> customer ;
      public ArrayList<Medicine> medicine ;
      public ArrayList<Purchase> purchase ;
	public PharmacyService(ArrayList<Customer> customer, ArrayList<Medicine> medicine, ArrayList<Purchase> purchase) {
		super();
		this.customer = customer;
		this.medicine = medicine;
		this.purchase = purchase;
	}
      
	  public boolean validateCustomer(String customerId) throws InvalidCustomerException {
	        for (Customer c : customer) {
	            if (c.getCustomerId().equalsIgnoreCase(customerId)) {
	                return true;
	            }
	        }
	        throw new InvalidCustomerException();
	    }
	  
	public Purchase createPurchase(String customerId, String medicineId, int qty) throws Exception{
		
		
		return null;
		
	}
	public void printPurchaseHistory(String customerId){
		for( Purchase p : customer) {
			if(p.getCustomerId().equalsIgnoreCase(customerId)){

			}
		}
	}

}
