import java.util.*;

public class QueueReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
        Queue<String> customerQueue = new LinkedList<>();

        int choice;
        do {
            System.out.println("\n=== Concert Reservation System (Queue Version) ===");
            System.out.println("1. Add Customer to Queue");
            System.out.println("2. Serve Next Customer (Reserve Seat)");
            System.out.println("3. Cancel Seat");
            System.out.println("4. View Queue");
            System.out.println("5. View Seats");
            System.out.println("6. Exit");
            System.out.print("Choose an Option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addCustomer(customerQueue, sc);
                    break;
                case 2:
                    serveCustomer(customerQueue, seats, sc);
                    break;
                case 3:
                    cancelSeat(seats, sc);
                    break;
                case 4:
                    viewQueue(customerQueue);
                    break;
                case 5:
                    showSeats(seats);
                    break;
                case 6:
                    System.out.println("Thank you for using the Concert Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    // ➕ Add customer to queue
    public static void addCustomer(Queue<String> queue, Scanner sc) {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        queue.offer(name);
        System.out.println(name + " added to the queue.");
    }

    // 🎫 Serve next customer
    public static void serveCustomer(Queue<String> queue, boolean[] seats, Scanner sc) {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        String customer = queue.poll();
        System.out.println("\nNow serving: " + customer);

        System.out.print("Enter seat number to reserve (1–25): ");
        int seatNum = sc.nextInt();

        if (seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is already reserved!");
        } else {
            // Get price automatically based on seat type
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

            System.out.println("\n✅ Reservation successful!");
            System.out.println("Customer: " + customer);
            System.out.println("Seat: " + seatNum + " (" + seatType + ")");
            System.out.println("Price: ₱" + price);
            System.out.println("Payment: ₱" + payment);
            System.out.println("Change: ₱" + change);
        }
    }

    // ❌ Cancel a reserved seat
    public static void cancelSeat(boolean[] seats, Scanner sc) {
        System.out.print("Enter seat number to cancel (1–25): ");
        int seatNum = sc.nextInt();

        if (seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number!");
            return;
        }

        if (!seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is not reserved.");
        } else {
            seats[seatNum - 1] = false;
            System.out.println("Seat " + seatNum + " has been canceled successfully!");
        }
    }

    // 👥 View queue
    public static void viewQueue(Queue<String> queue) {
        System.out.println("\n--- Current Queue ---");
        if (queue.isEmpty()) {
            System.out.println("No customers waiting.");
        } else {
            int pos = 1;
            for (String name : queue) {
                System.out.println(pos + ". " + name);
                pos++;
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
