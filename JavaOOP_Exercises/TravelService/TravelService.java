package TravelService;

import java.util.ArrayList;
import java.util.List;

public class TravelService {
    private List<String> flights;
    private List<String> hotels;
    private List<String> reservations;

    public TravelService() {
        this.flights = new ArrayList<>();
        this.hotels = new ArrayList<>();
        this.reservations = new ArrayList<>();
        flights.add("Flight 123 to NYC");
        flights.add("Flight 456 to London");
        hotels.add("Hotel Hilton in NYC");
        hotels.add("Hotel Marriott in London");
    }

    public List<String> searchFlights(String destination) {
        List<String> results = new ArrayList<>();
        for (String flight : flights) {
            if (flight.contains(destination)) {
                results.add(flight);
            }
        }
        return results;
    }

    public List<String> searchHotels(String location) {
        List<String> results = new ArrayList<>();
        for (String hotel : hotels) {
            if (hotel.contains(location)) {
                results.add(hotel);
            }
        }
        return results;
    }

    public void bookReservation(String item) {
        reservations.add(item);
        System.out.println("Booked: " + item);
    }

    public void cancelReservation(String item) {
        if (reservations.remove(item)) {
            System.out.println("Canceled: " + item);
        } else {
            System.out.println("Reservation not found: " + item);
        }
    }

    public List<String> getReservations() {
        return reservations;
    }
}

