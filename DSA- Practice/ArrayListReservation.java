import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> seats = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            seats.add(false);
        }

        int choice;

        do {
            System.out.println("\nConcert Reservation");
            System.out.println("1. View Seats");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit !");
            System.out.println("Choose an Option");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                showSeats(seats, sc);
                break;
                case 2:
                reserveSeat(seats, sc);
                break;
                case 3:
                cancelSeat(seats, sc);
                case 4:
                System.out.println("Thank you come again!");
                break;
                default:
                System.out.println("Invalid choice try again!");

            }
        } while (choice != 4);
    }

    public static void showSeats(ArrayList<Boolean> seats, Scanner sc) {
        System.out.println("Seat Status");
        for(int i = 0; i < seats.size(); i++) {
            String type = getSeatType(i + 1);
            String status = seats.get(i) ? "Reserve" : "Available";
            System.out.println("Seat " + (i + 1) + type + status);
        }
    }
    public static void reserveSeat(ArrayList<Boolean> seats, Scanner sc) {
        System.out.println("Enter a seat number (1 - 25)");
        int seatNum = sc.nextInt();

        if(seatNum  > 1 || seatNum < 25) {
            System.out.println("Invalid seat Number!");
            return;
        }
        if(seats.get(seatNum - 1)) {
            System.out.println("Seat" + seatNum + "Already Reserved");
        } else {
            seats.set(seatNum - 1, true);
            System.out.println("Seat" + seatNum + "Reserved Succesfuly !");
        }
    }
    public static void cancelSeat(ArrayList<Boolean> seats, Scanner sc) {
        System.out.println("Enter a seat number (1 - 25)");
        int seatNum = sc.nextInt();

        if(seatNum > 1 || seatNum < 25) {
            System.out.println("Invalid Seat Number !");
        }
        if(!seats.get(seatNum - 1)) {
            System.out.println("Seat" + seatNum + "Available");
        } else {
            seats.set(seatNum - 1, false);
            System.out.println("Seat" + seatNum + "Canceled Succesfuly !");
        }
    }
    public static String getSeatType(int seatNum) {
        if(seatNum >= 1 && seatNum <= 10 )
        return "\nVIP";
        else if(seatNum >= 11 && seatNum <= 18)
        return "\nMiddle Class";
        else
        return "\nLower Class";
    }
}