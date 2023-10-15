import java.util.Scanner;

public class Shape2DApp {


    public static void main(String[] args) {
        int count, choice;
        double totalArea = 0.0;


        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter total number of shapes: ");
        count = scanner.nextInt();

        Shape[] shapes = new Shape[count];


        for (int i = 0; i < count; i++) {
            System.out.println("Enter shape details for shape " + (i + 1));
            System.out.print("Select shape ——— 1 - Square, 2 - Rectangle, 3 - Circle, 4 - Triangle: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    shapes[i] = new Square(side);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = scanner.nextDouble();
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shapes[i] = new Triangle(base, height);
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    break;
            }

        }

        System.out.print("Do you want to calculate area (yes/no): ");
        String option = scanner.next();

        if (option.equalsIgnoreCase("yes")) {
            for (Shape shape : shapes) {
                totalArea += shape.findArea();
            }
            System.out.print("Total area = " + totalArea);
        }

        scanner.close();





    }





}
