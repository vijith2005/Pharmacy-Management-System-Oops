package com.wipro.phms.service;

import java.time.LocalDate;
import java.util.ArrayList;

import com.wipro.phms.entity.Customer;
import com.wipro.phms.entity.Medicine;
import com.wipro.phms.entity.Purchase;
import com.wipro.phms.util.InvalidCustomerException;
import com.wipro.phms.util.MedicineNotAvailableException;

public class PharmacyService {
    public ArrayList<Customer> customer;
    public ArrayList<Medicine> medicine;
    public ArrayList<Purchase> purchase;

    public PharmacyService(ArrayList<Customer> customer, ArrayList<Medicine> medicine, ArrayList<Purchase> purchase) {
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

	    public Medicine validateMedicine(String medicineId, int quantityRequired) throws MedicineNotAvailableException {
	        for (Medicine m : medicine) {
	            if (m.getMedicineId().equalsIgnoreCase(medicineId)) {
	                LocalDate expiry = LocalDate.parse(m.getExpiryDate());
	                if (m.getQuantityAvailable() >= quantityRequired && expiry.isAfter(LocalDate.now())) {
	                    return m;
	                }
	            }
	        }
	        throw new MedicineNotAvailableException();
	    }
	
	    public Purchase createPurchase(String customerId, String medicineId, int qty) throws Exception {
	        validateCustomer(customerId);
	        Medicine m = validateMedicine(medicineId, qty);
	
	        m.setQuantityAvailable(m.getQuantityAvailable() - qty);
	
	        double total = qty * m.getPrice();
	        String purchaseId = "P" + (purchase.size() + 1);
	
	        Purchase p = new Purchase(purchaseId, customerId, medicineId, qty, total);
	        this.purchase.add(p);
	        return p;
	    }

    public void printPurchaseHistory(String customerId) {
        boolean found = false;
        System.out.println("Purchase History for Customer: " + customerId);

        for (Purchase p : purchase) {
            if (p.getCustomerId().equalsIgnoreCase(customerId)) {
                found = true;
                System.out.println("-----------------------------------");
                System.out.println("Purchase ID : " + p.getPurchaseId());
                System.out.println("Medicine ID : " + p.getMedicineId());
                System.out.println("Quantity    : " + p.getQuantity());
                System.out.println("Total Amount: " + p.getTotalAmount());
            }
        }

        if (!found) {
            System.out.println("No purchases found for this customer.");
        }
    }
}
