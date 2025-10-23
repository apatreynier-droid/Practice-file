package Customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Double> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Double> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
    }

    public double calculateTotalExpenditure() {
        double total = 0.0;
        for (double purchase : purchaseHistory) {
            total += purchase;
        }
        return total;
    }
}

class LoyalCustomer extends Customer {
    private double discountRate; 

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double applyDiscount(double amount) {
        return amount * (1 - discountRate / 100);
    }
}


