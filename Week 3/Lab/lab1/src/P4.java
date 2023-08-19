import java.util.InputMismatchException;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = 0;

        while(true) {
            try {
                System.out.print("Enter height: ");
                height = scanner.nextInt();

            } catch (InputMismatchException err) {
                System.out.println("Enter whole numbers only");
                scanner.nextLine();
                continue;
            }

            if (height < 1) {
                System.out.println("Error input!!");
                continue;
            }
            scanner.close();
            break;
        }


       for (int i = 0; i < height; i++) {
           for (int j = 0; j <= i; j++) {
               if (i % 2 == 0) {
                   if (j % 2 == 0)
                       System.out.print("AA");
                   else
                       System.out.print("BB");

               } else {
                   if (j % 2 == 0)
                       System.out.print("BB");
                   else
                       System.out.print("AA");
               }
           }
           System.out.println("");
       }


    }
}
