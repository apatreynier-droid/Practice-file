package Vehicle;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private double trunkSize; // in cubic feet

    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public double getTrunkSize() {
        return trunkSize;
    }

    public void displayDetails() {
        System.out.println("Car - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear() + ", Trunk Size: " + trunkSize + " cubic feet");
    }
}

class Truck extends Vehicle {
    private double payloadCapacity; // in tons

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void displayDetails() {
        System.out.println("Truck - Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear() + ", Payload Capacity: " + payloadCapacity + " tons");
    }
}

