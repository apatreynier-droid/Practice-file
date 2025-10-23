package Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 15.1);
        Truck truck = new Truck("Ford", "F-150", 2019, 2.5);
        
        car.displayDetails();
        truck.displayDetails();
    }
}

