import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
        int choice;

        do {
            System.out.println("Concert Reservation");
            System.out.println("1. View Seats");
            System.out.println("2. Reserve Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit !");
            System.out.println("Choose Option !");
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
                System.out.println("Thank you come again !");
                break;
                default:
                System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }

    public static void showSeats(boolean[] seats) {
        System.out.println("Seat Status !");
        for(int i = 0; i < seats.length; i++) {
            String type = getSeatType(i + 1);
            String status = seats[i] ? "RESERVE" : "AVAILALBE";
            System.out.println("Seat " + (i + 1) + status + type);
        }
    }

    public static void reserveSeat(boolean[] seats, Scanner sc) {
        System.out.println("Enter seat numer 1 - 25");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid number seat!");
            return;
        }
        if(seats[seatNum - 1]) {
            System.out.println("SEAT" + seatNum + "Already reserved");
            return;
        }
        String type = getSeatType(seatNum);
        int price = getSeatPrice(type);

        System.out.println("Seat" + seatNum + type + "class");
        System.out.println("price" + price);
        System.out.println("Payment");
        int payment = sc.nextInt();

        if(payment < price) {
        System.out.println("Not enough balance");
        return;
        }
        int change = payment - price;
        seats[seatNum - 1] = true;
        System.out.println("Seat" + seatNum + "payment success!");
        System.out.println("Payment" + payment);
        System.out.println("change " + change);
        System.out.println("Thank you and enjoy");


    }

    public static void cancelSeat(boolean[] seats, Scanner sc) {
        System.out.println("Enter a number 1 - 25");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid !");
            return;
        }
        if(!seats[seatNum - 1]) {
            System.out.println("SEAT" + seatNum + "Available!");
        } else {
            seats[seatNum - 1] = false;
            System.out.println("Seat" + seatNum + "Cancel ok!");
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
    public static int getSeatPrice(String type) {
        switch(type) {
            case "VIP": return 1500;
            case "Middle Class" : return 1000;
            default :
            return 500;
        }
    }
    
}
