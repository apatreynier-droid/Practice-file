import java.util.*;

class Reservation {
    String customerName;
    int seatNumber;
    String seatType;
    double ticketPrice;
    double payment;
    double change;

    public Reservation(String customerName, int seatNumber, String seatType, double ticketPrice, double payment, double change) {
        this.customerName = customerName;
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.ticketPrice = ticketPrice;
        this.payment = payment;
        this.change = change;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName +
               "\nSeat Number: " + seatNumber +
               "\nSeat Type: " + seatType +
               "\nTicket Price: ₱" + ticketPrice +
               "\nPayment: ₱" + payment +
               "\nChange: ₱" + change +
               "\n---------------------------";
    }
}

public class LinkedListReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
        LinkedList<Reservation> reservations = new LinkedList<>();

        int choice;
        do {
            System.out.println("\n=== Concert Reservation System (LinkedList Version) ===");
            System.out.println("1. Reserve Seat");
            System.out.println("2. Cancel Seat");
            System.out.println("3. View All Reservations");
            System.out.println("4. View Seats");
            System.out.println("5. Exit");
            System.out.print("Choose an Option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    reserveSeat(reservations, seats, sc);
                    break;
                case 2:
                    cancelSeat(reservations, seats, sc);
                    break;
                case 3:
                    viewReservations(reservations);
                    break;
                case 4:
                    showSeats(seats);
                    break;
                case 5:
                    System.out.println("Thank you for using the Concert Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    // 🎟️ Reserve a seat
    public static void reserveSeat(LinkedList<Reservation> list, boolean[] seats, Scanner sc) {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter seat number to reserve (1–25): ");
        int seatNum = sc.nextInt();

        if (seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is already reserved!");
            return;
        }

        String seatType = getSeatType(seatNum);
        double price = getSeatPrice(seatType);

        System.out.println("Seat " + seatNum + " (" + seatType + ") costs ₱" + price);
        System.out.print("Enter payment amount (₱): ");
        double payment = sc.nextDouble();

        if (payment < price) {
            System.out.println("Not enough payment. Transaction canceled.");
            return;
        }

        double change = payment - price;
        seats[seatNum - 1] = true;

        Reservation newReservation = new Reservation(name, seatNum, seatType, price, payment, change);
        list.add(newReservation);

        System.out.println("\n✅ Reservation successful!");
        System.out.println(newReservation);
    }

    // ❌ Cancel a seat
    public static void cancelSeat(LinkedList<Reservation> list, boolean[] seats, Scanner sc) {
        System.out.print("Enter seat number to cancel (1–25): ");
        int seatNum = sc.nextInt();

        if (seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (!seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is not reserved.");
            return;
        }

        // Find and remove the reservation
        Iterator<Reservation> iterator = list.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Reservation r = iterator.next();
            if (r.seatNumber == seatNum) {
                iterator.remove();
                seats[seatNum - 1] = false;
                System.out.println("❌ Reservation for Seat " + seatNum + " canceled successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No reservation found for seat " + seatNum + ".");
        }
    }

    // 📋 View all reservations
    public static void viewReservations(LinkedList<Reservation> list) {
        System.out.println("\n--- All Reservations ---");
        if (list.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Reservation r : list) {
                System.out.println(r);
            }
        }
    }

    // 🪑 Display seat status
    public static void showSeats(boolean[] seats) {
        System.out.println("\n--- Seat Status ---");
        for (int i = 0; i < seats.length; i++) {
            String type = getSeatType(i + 1);
            String status = seats[i] ? "Reserved" : "Available";
            System.out.println("Seat " + (i + 1) + " (" + type + "): " + status);
        }
    }

    // 🏷️ Get seat type
    public static String getSeatType(int seatNum) {
        if (seatNum >= 1 && seatNum <= 10)
            return "VIP";
        else if (seatNum >= 11 && seatNum <= 20)
            return "Middle Class";
        else
            return "Lower Class/Poor";
    }

    // 💰 Get seat price
    public static double getSeatPrice(String seatType) {
        switch (seatType) {
            case "VIP":
                return 1500;
            case "Middle Class":
                return 1000;
            default:
                return 500;
        }
    }
}
