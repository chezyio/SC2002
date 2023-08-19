import java.util.InputMismatchException;
import java.util.Scanner;

public class P3 {

    // 1 USD = 1.82 SGD
    static final double RATE = 1.82;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int starting = 0, ending = 0, increment = 0;


        while(true) {
            try {
                System.out.print("Enter starting: ");
                starting = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Enter whole numbers only");
                scanner.nextLine();
                continue;
            }
            break;
        }

        while(true) {
            try {
                System.out.print("Enter ending: ");
                ending = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Enter whole numbers only");
                scanner.nextLine();
                continue;
            }

            if (ending < starting) {
                System.out.println("Error input!!");
                continue;
            }

            break;
        }

        while(true) {
            try {
                System.out.print("Enter increment: ");
                increment = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Enter whole numbers only");
                scanner.nextLine();
                continue;
            }
            scanner.close();
            break;
        }


        System.out.println("US$     S$");
        System.out.println("--------------");

        // for loop
        for (int i = starting; i <= ending; i += increment) {
            System.out.println(i + "       " + i * RATE);
        }

        // while loop
        while(starting <= ending) {
            System.out.println(starting + "       " + starting * RATE);
            starting += increment;
        }

        // do while loop
        do {
            System.out.println(starting + "       " + starting * RATE);
            starting += increment;
        } while (starting <= ending);
    }
}
