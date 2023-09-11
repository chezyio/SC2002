import java.util.Random;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int choice, m, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.print("Enter m: ");
                    m = sc.nextInt();
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    System.out.printf("%d/%d = %d\n", m, n, divide(m, n));
                    break;
                case 3:
                    System.out.print("Enter m: ");
                    m = sc.nextInt();
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    System.out.printf("%d%%%d = %d\n", m, n, modulus(m, n));
                    break;
                case 4:
                    System.out.print("Enter digits: ");
                    m = sc.nextInt();
                    int output = countDigits(m);
                    if (output == 0)
                        System.out.printf("n: %d - Error input!!\n", m);
                    else
                        System.out.printf("n: %d - count = %d\n", m, output);
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    m = sc.nextInt();
                    System.out.print("Enter digit: ");
                    n = sc.nextInt();
                    int pos = position(m, n);
                    System.out.println("position = " + pos);
                    break;
                case 6:
                    System.out.print("Enter digit: ");
                    long oddInput = sc.nextLong();
                    if (oddInput > 0)
                        System.out.println("oddDigits = " + extractOddDigits(oddInput));
                    else
                        System.out.println("oddDigits = Error input!!");
                    break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7 && choice >0);
    }
    /* add method code here */


    // randomly generate integers from [0, 9] and check if the answer that is input by user matches the computed truth
    public static void mulTest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int v1 = random.nextInt(9) + 1;
            int v2 = random.nextInt(9) + 1;
            System.out.print("How much is " + v1 + " times " + v2 + "? ");
            int input = scanner.nextInt();
            if (input == v1 * v2) {
                count++;
            }
        }
        System.out.println(count + " out of 5 are correct");
    }

    // division by subtraction and returns the quotient of dividing m by n
    public static int divide(int m, int n) {

        int count = 0;
        while (m >= n) {
            m -= n;
            ++count;
        }
        return count;
    }

    // division by subtraction and returns the remainder of dividing m by n
    public static int modulus(int m, int n) {

        int remainder = 0;
        while(m > 0)
        {
            remainder = m;
            m -= n;
        }

        if (m != 0)
            return remainder;
        else
            return 0;
    }

    // count how many of such digits
    public static int countDigits(int n) {
        int count = 0;

        if (n < 0) {
            return count;
        }
        else {
            while (n != 0) {
                // keep diving by 10 to remove last digit
                n /= 10;
                ++count;
            }
            return count;
        }
    }

    // get the position of the specified digit by counting from the rightmost starting at 1
    public static int position(int n, int digit) {

        int pos = 1;

        while (n > 0) {
            // check if the last digit is equal to the specified digit
            if (n % 10 == digit)
                return pos;
            // keep diving by 10 to remove last digit
            n /= 10;
            ++pos;
        }
        return -1;
    }

    // count how many odd digits are there in input
    public static long extractOddDigits(long n) {

        long odd = 0;
        long count = 1;


        while (n > 0) {

            // check if the last digit of n is odd
            if ((n % 10) % 2 != 0)
            {
                // if it's odd, the odd digit is added to the result while preserving its position
                odd += (count * (n % 10));
                count *= 10;
            }
            // remove the last digit of n by dividing it by 10
            n /= 10;
        }

        if (odd != 0)
            return odd;
        else
            return -1;

    }

}
