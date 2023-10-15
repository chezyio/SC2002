import java.util.Scanner;

public class Shape3DApp {

    public static void main(String[] args) {
        int count, choice;
        double totalSurfaceArea = 0.0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total number of shapes: ");
        count = scanner.nextInt();

        Shape[] shapes = new Shape[count];


        for (int i = 0; i < count; i++) {
            System.out.println("Enter shape details for shape " + (i + 1));
            System.out.print("Select shape ——— 1 - Cube, 2 - Cuboid, 3 - Sphere, 4 - Pyramid, 5 - Cone, 6 - Cylinder: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    shapes[i] = new Cube(side);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shapes[i] = new Cuboid(length, breadth, width);
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shapes[i] = new Sphere(radius);
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shapes[i] = new Pyramid(base, height);
                    break;
                case 5:
                    System.out.print("Enter base: ");
                    base = scanner.nextInt();
                    System.out.print("Enter length: ");
                    length = scanner.nextInt();
                    shapes[i] = new Cone(base, length);
                    break;
                case 6:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextInt();
                    System.out.print("Enter length: ");
                    length = scanner.nextInt();
                    shapes[i] = new Cylinder(radius, length);
                    break;
                default:
                    System.out.println("Invalid choice");
                    i--;
                    break;
            }
        }

        System.out.print("Do you want to calculate total surface area (yes/no): ");
        String option = scanner.next();

        if (option.equalsIgnoreCase("yes")) {
            for (Shape shape : shapes) {
                totalSurfaceArea += shape.findArea();
            }
            System.out.print("Total surface area = " + totalSurfaceArea);
        }

        scanner.close();
    }
}
