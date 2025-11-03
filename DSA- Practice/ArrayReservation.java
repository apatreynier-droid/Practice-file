import java.util.Scanner;

public class ArrayReservation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
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
                showSeats(seats);
                break;
                case 2:
                reserveSeat(seats, sc);
                break;
                case 3:
                cancelSeat(seats, sc);
                break;
                case 4:
                System.out.println("Thank you for patronage");
                break;
                default:
                System.out.println("Invalid choice");
            }


        } while (choice != 4);
        
    }

    public static void showSeats(boolean[] seats) {
        System.out.println("Seat Status !");
        for(int i = 0; i < seats.length; i++) {
        String type = getSeatType(i + 1);
        String status = seats[i] ? "Reserved " : "Available";
        System.out.println("Seat" + (i + 1) + type + status);
    }
}
    public static void reserveSeat(boolean[] seats, Scanner sc) {
        System.out.println("Enter a seat Number (1 -25)");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number !");
            return;
        }
        if(seats[seatNum - 1]) {
            System.out.println("Seat" + seatNum + "Already reserved !");

        } else {
            seats[seatNum - 1] = true;
            System.out.println("Seat" + seatNum + "Reserved Successfuly !");
        }
    }
    public static void cancelSeat(boolean[] seats, Scanner sc) {
        System.out.println("Enter a seat number (1 - 25)");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number !");
            return;
        }
        if(!seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + "Seat available");
        } else {
            seats[seatNum - 1] = false;
            System.out.println("Seat" + seatNum + "Canceled Successfuly !");
        }
    }
    public static String getSeatType(int seatNum) {
        if(seatNum >= 1 && seatNum <= 10)
        return "VIP";
        else if(seatNum >= 11 && seatNum <= 25)
        return "Middle Class";
        else
        return "Low Class";
        
        
    }
}