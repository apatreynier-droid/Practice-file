import java.util.*;

public class StackReservation {
    static class Reservation {
        String customerName;
        int seatNumber;
        double amountPaid;
        double price;
        double change;

        Reservation(String name, int seat, double price, double payment) {
            this.customerName = name;
            this.seatNumber = seat;
            this.price = price;
            this.amountPaid = payment;
            this.change = payment - price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[25];
        Stack<Reservation> stack = new Stack<>();

        int choice;

        do {
            System.out.println("\n=== Concert Reservation System (Stack Version) ===");
            System.out.println("1. Reserve Seat (Push)");
            System.out.println("2. Undo Last Reservation (Pop)");
            System.out.println("3. View Last Reservation (Peek)");
            System.out.println("4. View All Reservations");
            System.out.println("5. View Seats");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    reserveSeat(seats, stack, sc);
                    break;
                case 2:
                    undoReservation(seats, stack);
                    break;
                case 3:
                    viewLastReservation(stack);
                    break;
                case 4:
                    viewAllReservations(stack);
                    break;
                case 5:
                    showSeats(seats);
                    break;
                case 6:
                    System.out.println("Thank you for using the Concert Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    // 🪑 Reserve seat (Push)
    public static void reserveSeat(boolean[] seats, Stack<Reservation> stack, Scanner sc) {
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("Enter seat number (1–25): ");
        int seatNum = sc.nextInt();

        if (seatNum < 1 || seatNum > 25) {
            System.out.println("Invalid seat number!");
            return;
        }
        if (seats[seatNum - 1]) {
            System.out.println("Seat " + seatNum + " is already reserved!");
            return;
        }

        System.out.print("Enter ticket price (₱): ");
        double price = sc.nextDouble();
        System.out.print("Enter payment amount (₱): ");
        double payment = sc.nextDouble();

        if (payment < price) {
            System.out.println("Insufficient payment. Reservation canceled.");
            return;
        }

        double change = payment - price;
        seats[seatNum - 1] = true;

        Reservation res = new Reservation(name, seatNum, price, payment);
        stack.push(res);

        System.out.println("\n✅ Reservation Successful!");
        System.out.println("Customer: " + name);
        System.out.println("Seat: " + seatNum + " (" + getSeatType(seatNum) + ")");
        System.out.println("Payment: ₱" + payment);
        System.out.println("Change: ₱" + change);
    }

    // ↩️ Undo last reservation (Pop)
    public static void undoReservation(boolean[] seats, Stack<Reservation> stack) {
        if (stack.isEmpty()) {
            System.out.println("No reservations to undo.");
            return;
        }

        Reservation last = stack.pop();
        seats[last.seatNumber - 1] = false;

        System.out.println("\n❌ Last reservation has been undone:");
        System.out.println("Customer: " + last.customerName);
        System.out.println("Seat: " + last.seatNumber);
    }

    // 👀 View last reservation (Peek)
    public static void viewLastReservation(Stack<Reservation> stack) {
        if (stack.isEmpty()) {
            System.out.println("No recent reservations.");
            return;
        }

        Reservation top = stack.peek();
        System.out.println("\n--- Last Reservation ---");
        System.out.println("Customer: " + top.customerName);
        System.out.println("Seat: " + top.seatNumber + " (" + getSeatType(top.seatNumber) + ")");
        System.out.println("Paid: ₱" + top.amountPaid + " | Price: ₱" + top.price + " | Change: ₱" + top.change);
    }

    // 📋 View all reservations
    public static void viewAllReservations(Stack<Reservation> stack) {
        if (stack.isEmpty()) {
            System.out.println("No reservations made yet.");
            return;
        }

        System.out.println("\n--- All Reservations (Top to Bottom) ---");
        Stack<Reservation> temp = (Stack<Reservation>) stack.clone();
        while (!temp.isEmpty()) {
            Reservation r = temp.pop();
            System.out.println("Customer: " + r.customerName + " | Seat: " + r.seatNumber + " (" + getSeatType(r.seatNumber) + ")");
        }
    }

    // 🪑 Show seat availability
    public static void showSeats(boolean[] seats) {
        System.out.println("\n--- Seat Status ---");
        for (int i = 0; i < seats.length; i++) {
            String type = getSeatType(i + 1);
            String status = seats[i] ? "Reserved" : "Available";
            System.out.println("Seat " + (i + 1) + " (" + type + "): " + status);
        }
    }

    // 🎟️ Get seat type
    public static String getSeatType(int seatNum) {
        if (seatNum >= 1 && seatNum <= 10)
            return "VIP";
        else if (seatNum >= 11 && seatNum <= 20)
            return "Middle Class";
        else
            return "Poor";
    }
}
