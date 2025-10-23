package CustomerOrder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class CustomerOrder {
    private String orderID;
    private String customer;
    private LocalDate orderDate;

    public CustomerOrder(String orderID, String customer, LocalDate orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}

class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String trackingStatus;

    public OnlineOrder(String orderID, String customer, LocalDate orderDate,
                       String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Pending";
    }

    public int calculateDeliveryTime() {
        if (deliveryAddress.toLowerCase().contains("manila")) {
            return 2; 
        } else if (deliveryAddress.toLowerCase().contains("luzon")) {
            return 4;
        } else if (deliveryAddress.toLowerCase().contains("visayas")) {
            return 6;
        } else if (deliveryAddress.toLowerCase().contains("mindanao")) {
            return 7;
        } else {
            return 10; 
        }
    }

    public void updateTrackingStatus(String newStatus) {
        this.trackingStatus = newStatus;
        System.out.println("Tracking status updated to: " + trackingStatus);
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}

