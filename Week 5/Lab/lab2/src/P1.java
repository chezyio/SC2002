import java.util.Random;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int choice;
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
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.println("Enter m: ");
                    int m2 = sc.nextInt();
                    System.out.println("Enter n: ");
                    int n2 = sc.nextInt();
                    int result2 = divide(m2, n2);
                    System.out.println(result2);
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Enter m: ");
                    int m3 = sc.nextInt();
                    System.out.println("Enter n: ");
                    int n3 = sc.nextInt();
                    int result3 = modulus(m3, n3);
                    System.out.println(result3);
                    break;
                case 4: /* add countDigits() call */
                    System.out.print("Enter digits: ");
                    int i4 = sc.nextInt();
                    countDigits(i4);
                    break;
                case 5: /* add position() call */
                    System.out.print("Enter number: ");
                    int number = sc.nextInt();
                    System.out.print("Enter digit: ");
                    int digit = sc.nextInt();
                    int pos = position(number, digit);
                    System.out.println(pos);
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.print("Enter digit: ");
                    long oddInput = sc.nextLong();
                    long oddCount = extractOddDigits(oddInput);
                    System.out.println(oddCount);
                    break;
                case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    /* add method code here */


    // randomly generate integers from [0, 9] and check if the answer that is input by user matches the computed truth
    public static void mulTest() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int v1 = random.nextInt(10);
            int v2 = random.nextInt(10);
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

    // division by modulus and returns the remainder of dividing m by n
    public static int modulus(int m, int n) {

        while (m >= n) {
            m %= n;
        }
        return m;
    }

    // count how many of such digits
    public static int countDigits(int n) {
        int count = 0;

        if (n < 0) {
            System.out.print("Error input!!");
            return 0;
        }
        else {
            while (n != 0) {
                n /= 10;
                ++count;
            }
            System.out.println("Count = " + count);
            return 0;
        }
    }

    // get the position of the specified digit by counting from the rightmost starting at 1
    public static int position(int n, int digit) {

        int pos = 1;

        while (n > 0) {
            if (n % 10 == digit)
                return pos;
            n /= 10;
        }
        return -1;
    }

    // count how many odd digits are there in input
    public static long extractOddDigits(long n) {

        long odd = 0;
        long count = 1;


        while (n > 0) {
            if ((n % 10) % 2 != 0)
            {
                odd += (count * (n % 10));
                count *= 10;
            }
            n /= 10;
        }

        if (odd != 0)
            return odd;
        else
            return -1;

    }

}
