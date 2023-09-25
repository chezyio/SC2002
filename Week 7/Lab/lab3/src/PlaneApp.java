import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {

        int choice;
        int seatId, customerId;
        Plane ca = new Plane();

        Scanner scanner = new Scanner(System.in);
        System.out.println("PlaneApp");
        System.out.println("(1) Show the number of empty seats\n" +
                "(2) Show the list of empty seats\n" +
                "(3) Show the list of customers together with their seat numbers in the order of the seat numbers\n" +
                "(4) Show the list of customers together with their seat numbers in the order of the customer ID\n" +
                "(5) Assign a customer to a seat\n" +
                "(6) Remove a seat assignment\n" +
                "(7) Quit");
        
        do {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ca.showNumEmptySeats();
                    break;
                case 2:
                    ca.showEmptySeats();
                    break;
                case 3:
                    ca.showAssignedSeats(true);
                    break;
                case 4:
                    ca.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat .. ");
                    System.out.print("Please enter Seat ID: ");
                    seatId = scanner.nextInt();
                    System.out.print("Please enter Customer ID: ");
                    customerId = scanner.nextInt();
                    ca.assignSeat(seatId, customerId);
                    break;
                case 6:
                    System.out.print("Enter Seat ID to unassign customer from: ");
                    seatId = scanner.nextInt();
                    ca.unAssignSeat(seatId);
                    break;
                case 7:
                    System.out.println("Program terminating...");
                    break;
            }

        } while (choice < 7);

        scanner.close();
    }

}
