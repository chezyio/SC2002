import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A. Action movie \nC. Comedy movie \nD. Drama movie");
        System.out.print("Enter choice: ");

        char choice = scanner.next().charAt(0);

        scanner.close();

        switch (choice) {
            case 'A','a':
                System.out.println("Action movie fan\n");
                break;
            case 'B','b':
                System.out.println("Comedy movie fan\n");
                break;
            case 'C','c':
                System.out.println("Drama movie fan\n");
                break;
            default:
                System.out.println("Invalid choice\n");
        }


    }
}
