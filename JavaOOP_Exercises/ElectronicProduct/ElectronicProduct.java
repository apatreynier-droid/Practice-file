package ElectronicProduct;

public class ElectronicProduct {
    private String productId;
    private String name;
    private double price;

    public ElectronicProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double discountPercent) {
        price -= price * (discountPercent / 100);
    }

    public double calculateFinalPrice() {
        return price;
    }
}

class WashingMachine extends ElectronicProduct {
    private int warrantyPeriod; 

    public WashingMachine(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void extendWarranty(int additionalYears) {
        warrantyPeriod += additionalYears;
    }
}

