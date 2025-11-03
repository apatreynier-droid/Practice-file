import java.util.Scanner;

public class ArrayReservationPayment {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
        int choice;

        do {
            System.out.println("\n=== Concert Reservation System ===");
            System.out.println("1. View Seats");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    showSeats(seats);
                    break;
                case 2:
                    reserveSeat(seats, sc);
                    break;
                case 3:
                    cancelSeat(seats, sc);
                    break;
                case 4:
                    System.out.println("Thank you for your patronage!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    public static void showSeats(boolean[] seats) {
        System.out.println("\n--- Seat Status ---");
        for(int i = 0; i < seats.length; i++) {
            String type = getSeatType(i + 1);
            String status = seats[i] ? "RESERVED" : "AVAILABLE";
            System.out.println("Seat " + (i + 1) + " (" + type + "): " + status);
        }
    }

    public static void reserveSeat(boolean[] seats, Scanner sc) {
        System.out.print("Enter seat number (1 - 25): ");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid Seat Number!");
            return;
        }

        if(seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is already reserved.");
            return;
        }

        String type = getSeatType(seatNum);
        int price = getSeatPrice(type);

        System.out.println("Seat " + seatNum + " is " + type + " class.");
        System.out.println("Ticket Price: ₱" + price);
        System.out.print("Enter your payment amount: ₱");
        int payment = sc.nextInt();

        if (payment < price) {
            System.out.println("Insufficient payment. Reservation canceled.");
            return;
        }

        int change = payment - price;
        seats[seatNum - 1] = true;
        System.out.println("Seat " + seatNum + " reserved successfully!");
        System.out.println("Payment received: ₱" + payment);
        System.out.println("Change: ₱" + change);
        System.out.println("Thank you and enjoy the concert!");
    }

    public static void cancelSeat(boolean[] seats, Scanner sc) {
        System.out.print("Enter seat number (1 - 25): ");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid Seat Number!");
            return;
        }

        if(!seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is not reserved.");
        } else {
            seats[seatNum - 1] = false;
            System.out.println("Seat " + seatNum + " canceled successfully!");
        }
    }

    public static String getSeatType(int seatNum) {
        if(seatNum >= 1 && seatNum <= 10)
            return "VIP";
        else if(seatNum >= 11 && seatNum <= 20)
            return "Middle Class";
        else
            return "Poor";
    }

    public static int getSeatPrice(String type) {
        switch(type) {
            case "VIP": return 2000;
            case "Middle Class": return 1000;
            default: return 500;
        }
    }
}
