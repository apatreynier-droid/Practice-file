package TravelService;

import java.util.ArrayList;
import java.util.List;
public class TravelServiceMain {
    public static void main(String[] args) {
        TravelService ts = new TravelService();
        
        List<String> flights = ts.searchFlights("NYC");
        List<String> hotels = ts.searchHotels("London");
        System.out.println("Flights to NYC: " + flights);
        System.out.println("Hotels in London: " + hotels);
        
        ts.bookReservation("Flight AA123 to NYC");
        ts.bookReservation("Hotel Marriott in London");
        System.out.println("Reservations: " + ts.getReservations());
        
        ts.cancelReservation("Flight AA123 to NYC");
        System.out.println("After cancel - Reservations: " + ts.getReservations());
    }
}
