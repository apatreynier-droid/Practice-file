package Reservation;

import java.time.LocalDate;

public class Reservation {
    private String reservationID;
    private String customerName;
    private LocalDate reservationDate;
    private String status;

    public Reservation(String reservationID, String customerName, LocalDate reservationDate) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.reservationDate = reservationDate;
        this.status = "Pending"; 
    }

    public void checkReservationStatus() {
        System.out.println("Reservation Status: " + status);
    }

    public void modifyReservationDetails(String newCustomerName, LocalDate newDate) {
        this.customerName = newCustomerName;
        this.reservationDate = newDate;
        System.out.println("Reservation details updated successfully!");
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void displayReservationDetails() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Reservation Date: " + reservationDate);
        System.out.println("Status: " + status);
    }
}

class ResortReservation extends Reservation {
    private int roomNumber;

    public ResortReservation(String reservationID, String customerName, LocalDate reservationDate, int roomNumber) {
        super(reservationID, customerName, reservationDate);
        this.roomNumber = roomNumber;
    }

    public void modifyRoomNumber(int newRoomNumber) {
        this.roomNumber = newRoomNumber;
        System.out.println("Room number updated to " + newRoomNumber);
    }

    @Override
    public void displayReservationDetails() {
        System.out.println("=== Resort Reservation ===");
        super.displayReservationDetails();
        System.out.println("Room Number: " + roomNumber);
    }
}

class RailwayReservation extends Reservation {
    private String seatNumber;

    public RailwayReservation(String reservationID, String customerName, LocalDate reservationDate, String seatNumber) {
        super(reservationID, customerName, reservationDate);
        this.seatNumber = seatNumber;
    }

    public void modifySeatNumber(String newSeatNumber) {
        this.seatNumber = newSeatNumber;
        System.out.println("Seat number updated to " + newSeatNumber);
    }

    @Override
    public void displayReservationDetails() {
        System.out.println("=== Railway Reservation ===");
        super.displayReservationDetails();
        System.out.println("Seat Number: " + seatNumber);
    }
}

