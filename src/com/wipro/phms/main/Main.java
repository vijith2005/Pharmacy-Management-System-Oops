package com.wipro.phms.main;
import java.util.ArrayList;
import com.wipro.phms.entity.*;
import com.wipro.phms.service.PharmacyService;
import com.wipro.phms.util.*;

public class Main {
	public static void main(String[] args) {
	 ArrayList<Customer> customers = new ArrayList<>();
	 customers.add(new Customer("C001", "Ravi Kumar", "9876543210"));
	 customers.add(new Customer("C002", "Priya Nair", "9123456780"));
	 ArrayList<Medicine> medicines = new ArrayList<>();
	 medicines.add(new Medicine("M101", "Paracetamol 650mg", 25.0, 50, "2025-12-30", false));
	 medicines.add(new Medicine("M102", "Amoxicillin 500mg", 120.0, 20, "2024-05-20", true));
	 medicines.add(new Medicine("M103", "Cough Syrup", 80.0, 0, "2026-01-15", false)); // Out of stock
	 ArrayList<Purchase> purchases = new ArrayList<>();
	 PharmacyService service = new PharmacyService(customers, medicines, purchases);
	 try {
	   Purchase p = service.createPurchase("C001", "M101", 3);
	    System.out.println("Purchase Successful!");
	    System.out.println("Purchase ID: " + p.getPurchaseId());
	    System.out.println("Total Amount: Rs." + p.getTotalAmount());
	    System.out.println("\n--- Purchase History ---");
	     
	    service.printPurchaseHistory("C001");
	     } catch (InvalidCustomerException ice) {
             
	    	 System.out.println(ice.toString());
	     
	     } catch (MedicineNotAvailableException mna) {
	     
	    	 System.out.println(mna.toString());
	
	     } catch (PurchaseException pe) {
	
	    	 System.out.println(pe.toString());
	
	     } catch (Exception ex) {
	
	    	 System.out.println("Unexpected Error: " + ex);
	      } 
	
	  }
	}

