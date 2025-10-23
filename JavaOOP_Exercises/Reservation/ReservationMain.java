package Reservation;

import java.time.LocalDate;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation(
                "RES-001", 
                "Reynier Apat", 
                LocalDate.of(2025, 11, 15), 
                205
        );

        resort.displayReservationDetails();
        resort.checkReservationStatus();

        System.out.println("\n--- Updating Resort Reservation ---");
        resort.modifyReservationDetails("Reynier A.", LocalDate.of(2025, 11, 20));
        resort.modifyRoomNumber(310);
        resort.updateStatus("Confirmed");
        resort.displayReservationDetails();

        System.out.println("\n----------------------------------------\n");
        RailwayReservation railway = new RailwayReservation(
                "RAIL-101", 
                "Maria Santos", 
                LocalDate.of(2025, 12, 1), 
                "B12"
        );

        railway.displayReservationDetails();
        railway.checkReservationStatus();

        System.out.println("\n--- Updating Railway Reservation ---");
        railway.modifyReservationDetails("Maria S.", LocalDate.of(2025, 12, 3));
        railway.modifySeatNumber("C5");
        railway.updateStatus("Confirmed");
        railway.displayReservationDetails();
    }
}
