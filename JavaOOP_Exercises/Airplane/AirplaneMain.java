package Airplane;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane a = new Airplane("12345", "NYC", "10:00");
        System.out.println("Flight Number: " + a.getFlightNumber());
        System.out.println("Destination: " + a.getDestination());
        System.out.println("Departure Time: " + a.getDepartureTime());
        System.out.println("Status: " + a.checkStatus());
        
        a.delay(30);
        System.out.println("After delay - Status: " + a.checkStatus());
        System.out.println("Updated Departure Time: " + a.getDepartureTime());
        
        a.setDestination("LAX");
        System.out.println("Updated Destination: " + a.getDestination());
    }
}
