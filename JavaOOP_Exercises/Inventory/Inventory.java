package Inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<String> products;
    private int lowThreshold = 5;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public List<String> getProducts() {
        return products;
    }

    public void setLowThreshold(int threshold) {
        this.lowThreshold = threshold;
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void removeProduct(String product) {
        products.remove(product);
    }

    public boolean isLowInventory() {
        return products.size() < lowThreshold;
    }
}

