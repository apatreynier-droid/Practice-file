package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<String> menuItems;
    private List<Double> prices;
    private List<Double> ratings;

    public Restaurant() {
        this.menuItems = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    
    public List<String> getMenuItems() {
        return menuItems;
    }

    public List<Double> getPrices() {
        return prices;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public void addItem(String item, double price, double rating) {
        menuItems.add(item);
        prices.add(price);
        ratings.add(rating);
    }

    public void removeItem(String item) {
        int index = menuItems.indexOf(item);
        if (index != -1) {
            menuItems.remove(index);
            prices.remove(index);
            ratings.remove(index);
        }
    }

    public double calculateAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }
}

