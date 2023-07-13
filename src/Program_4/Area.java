package Program_4;

import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area of the circle: " + circle.getArea());
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                Square square = new Square(sideLength);
                System.out.println("Area of the square: " + square.getArea());
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area of the rectangle: " + rectangle.getArea());
                break;
            case 4:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Area of the triangle: " + triangle.getArea());
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
    }

