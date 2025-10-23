package Airplane;

public class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private String status;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.status = "On time";
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getStatus() {
        return status;
    }

    
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String checkStatus() {
        return status;
    }

    public void delay(int minutes) {
        status = "Delayed by " + minutes + " minutes";
        departureTime = "Delayed to " + departureTime + " + " + minutes + " min";
    }
}

