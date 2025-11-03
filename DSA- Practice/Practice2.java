import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> seats = new ArrayList<>();

        for(int i = 0; i < 25; i++) {
            seats.add(false);
        }
        int choice;

        do {
            System.out.println("Concert Reservation");
            System.out.println("1. View Seats");
            System.out.println("2. Reserve seat");
            System.out.println("3. Cancel seat");
            System.out.println("Exit !");
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
                System.out.println("Thank you and have a great day!");
                break;
                default:
                System.out.println("Invalid Choice Please Try Again!");              
            }
        } while (choice != 4);
    }
    public static void showSeats(ArrayList<Boolean> seats) {
        System.out.println("Seat Status !");
        for(int i = 0; i < seats.size(); i++) {
            String type = getSeatType(i + 1);
            String status = seats.get(i) ? "RESERVE" : "AVAILABLE";
            System.out.println("SEAT :" + (i + 1) + status + type);
        }
    }

    public static void reserveSeat(ArrayList<Boolean> seats, Scanner sc) {
        System.out.println("Enter a seat (1 - 25)");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number!");
            return;
        }
        if(seats.get(seatNum - 1)) {
            System.out.println("SEAT :" + seatNum + "ALREADY RESERVED !");           
            
        } else {
            String type = getSeatType(seatNum);
            double price = getSeatPrice(seatNum);

            System.out.println("SEAT" + seatNum + type + price);
            System.out.println("Enter payment amount");
            double payment=sc.nextDouble();

            if(payment < price) {
                System.out.println("Not enough balance");
                return;
            }
            double change = payment - price;
            seats.set(seatNum - 1, true);

            System.out.println("Reservation Success !");
            System.out.println("Seat Number :" + seatNum);
            System.out.println("Seat Type :" + type);
            System.out.println("Amount paid :" + payment);
            System.out.println("Change :" + change);
        }
        
    }
    public static void cancelSeat(ArrayList<Boolean> seats, Scanner sc) {
        System.out.println("Enter a number seat (1 - 25)");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25 ) {
            System.out.println("Invalid seat number !");
            return;
        }
        if(!seats.get(seatNum - 1)) {
            System.out.println("SEAT" + seatNum + "Available!");
        } else {
            seats.set(seatNum - 1, false);
            System.out.println("SEAT :" + seatNum + "Canceled Success");
        }

    }
    public static String getSeatType(int seatNum) {
        if(seatNum >= 1 && seatNum <= 10)
        return "VIP";
        else if(seatNum >= 11 && seatNum <= 19)
        return "Middle Class";
        else
        return "Lower Class";
    }

    public static double getSeatPrice(int seatNum) {
        if(seatNum >= 1 && seatNum <= 10)
        return 1500.00;
        else if(seatNum >= 11 && seatNum <= 19)
        return 1000.00;
        else
        return 500.00;
    }
}
