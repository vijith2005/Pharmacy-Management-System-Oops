package com.wipro.phms.entity;

public class Purchase {
    private String purchaseId;
    private String customerId;
    private String medicineId;
    private int quantity;
    private double totalAmount;

    public Purchase() { }

    public Purchase(String purchaseId, String customerId, String medicineId, int quantity, double totalAmount) {
        this.purchaseId = purchaseId;
        this.customerId = customerId;
        this.medicineId = medicineId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId='" + purchaseId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", medicineId='" + medicineId + '\'' +
                ", quantity=" + quantity +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
