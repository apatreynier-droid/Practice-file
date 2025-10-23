package Customer;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer("Alice", "alice@example.com");
        c.addPurchase(100.0);
        c.addPurchase(50.0);
        System.out.println("Customer: " + c.getName());
        System.out.println("Total Expenditure: $" + c.calculateTotalExpenditure());
        
        LoyalCustomer lc = new LoyalCustomer("Bob", "bob@example.com", 10.0);
        lc.addPurchase(200.0);
        lc.addPurchase(75.0);
        System.out.println("Loyal Customer: " + lc.getName());
        System.out.println("Total Expenditure: $" + lc.calculateTotalExpenditure());
        System.out.println("Discounted Price for $100: $" + lc.applyDiscount(100.0));
    }
}