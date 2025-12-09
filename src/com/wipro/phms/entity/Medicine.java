package com.wipro.phms.entity;

public class Medicine {

	private String medicineId ;
	private String name;
	private double price;
	private int quantityAvailable;
	private String expiryDate;
	private boolean prescriptionRequired;
	
	
	public Medicine() {}


	public Medicine(String medicineId, String name, double price, int quantityAvailable, String expiryDate,
			boolean prescriptionRequired) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.price = price;
		this.quantityAvailable = quantityAvailable;
		this.expiryDate = expiryDate;
		this.prescriptionRequired = prescriptionRequired;
	}


	public String getMedicineId() {
		return medicineId;
	}


	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantityAvailable() {
		return quantityAvailable;
	}


	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

  
	public boolean isPrescriptionRequired() {
		return prescriptionRequired;
	}


	public void setPrescriptionRequired(boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}


	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", name=" + name + ", price=" + price + ", quantityAvailable="
				+ quantityAvailable + ", expiryDate=" + expiryDate + ", prescriptionRequired=" + prescriptionRequired
				+ "]";
	}


}
