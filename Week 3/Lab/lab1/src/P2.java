import java.util.InputMismatchException;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        int salary = 0;
        int merit = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Enter salary: ");
                salary = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Enter whole numbers only");
                scanner.nextLine();
                continue;
            }

            if (salary < 500 || salary > 899) {
                System.out.println("Error input!!");
                continue;
            }

            break;
        }

        while(true) {
            try {
                System.out.print("Enter points: ");
                merit = scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Enter whole numbers only");
                scanner.nextLine();
                continue;
            }
            break;
        }


        switch (salary / 100) {
            case 5:
                System.out.println("Grade C");
                break;
            case 6:
                if (merit < 10 && salary < 650)
                    System.out.println("Grade C");
                else
                    System.out.println("Grade B");
                break;
            default:
                if (merit < 20 && salary < 800)
                    System.out.println("Grade B");
                else
                    System.out.println("Grade A");
        }


    }
}
