import java.util.Scanner;
public class Grr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
        int choice;

        do {
            System.out.println("View Rooms");
            System.out.println("Reserve Room");
            System.out.println("Cancel Room");
            System.out.println("Exit !");
            System.out.println("Choose Option");
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
                System.out.println("Thank you bye!");
                break;
                default:
                System.out.println("Invalid try again!");
            }

        } while (choice != 4);
    }
    public static void showSeats(boolean[] seats) {
        System.out.println("SEATS STATUS");
        for(int i = 0 ; i < seats.length; i ++) {
            String type = getSeatType(i + 1);
            String status = seats[i] ? "RESERVE : " : "AVAILABLE : ";
            System.out.println("SEAT : " + (i + 1) + status + type);

        }
    }
    public static void reserveSeat(boolean[] seats, Scanner sc) {
        System.out.println("Enter a seat Number (1 -25)");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid Input !");
            return;
        }
        if(seats[seatNum - 1]) {
            System.out.println("SEAT : " + seatNum + "Already Reserved!");
            return;
        }
        String type = getSeatType(seatNum);
        int price = getSeatPrice(type);

        System.out.println("SEAT : " + seatNum + type + "Class");
        System.out.println("Price :" + price);
        System.out.println("Payment ! :");
        int payment = sc.nextInt();

        if(payment < price) {
            System.out.println("Not enough balance!");
            return;
        }
        int change = payment - price;
        seats[seatNum - 1] = true;
        System.out.println("Seat : " + seatNum + "Successful!");
        System.out.println("Payment : " + payment);
        System.out.println("Change : " + change);
        System.out.println("Thank you and enjoy!");

    }
    public static void cancelSeat(boolean[] seats, Scanner sc) {
        System.out.println("Enter a seat Number 1 - 25");
        int seatNum = sc.nextInt();

        if(seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid Input!");
            return;
        }
        if(!seats[seatNum - 1]) {
            System.out.println("SEAT" + seatNum + "AVAILABLE ! ");
        } else {
            seats[seatNum - 1] = false;
            System.out.println("SEAT" + seatNum + "CANCEL SUCCESs ! ");
        }
    }
    public static String getSeatType(int seatNum) {
        if(seatNum >= 1 && seatNum <= 10)
        return "VIP : ";
        else if(seatNum >= 11 && seatNum <= 19)
        return "Middle  : ";
        else
        return "Lower  : ";
    }

    public static int getSeatPrice(String type) {
        switch(type) {
            case "VIP : " : return 1500;
            case "Middle Class : " : return 1000;
            default : return 500;
        }
    }
}
