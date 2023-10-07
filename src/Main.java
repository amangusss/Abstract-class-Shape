import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while (true) {

                System.out.println("Choose shape (1=Rectangle, 2=Circle, 3=Triangle, 4=Square, 5=Exit):");

                int choice = scanner.nextInt();

                if (choice == 5) {
                    System.out.println("Goodbye!");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        Rectangle rectangle = new Rectangle("Rectangle",width, height);
                        displayShapeInfo(rectangle);
                        break;
                    case 2:
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        Circle circle = new Circle("Circle",radius);
                        displayShapeInfo(circle);
                        break;

                    case 3:
                        System.out.print("Enter side1 length: ");
                        double side1 = scanner.nextDouble();
                        System.out.print("Enter side2 length: ");
                        double side2 = scanner.nextDouble();
                        System.out.print("Enter side3 length: ");
                        double side3 = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        Triangle triangle = new Triangle("Triangle",side1, side2, side3);
                        displayShapeInfo(triangle);
                        break;

                    case 4:
                        System.out.print("Enter side length: ");
                        double sideLength = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        Square square = new Square("Square",sideLength);
                        displayShapeInfo(square);
                        break;
                }
            }

            scanner.close();

    }
    private static void displayShapeInfo(Shape shape) {
        System.out.println("Shape: " + shape.getName());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
