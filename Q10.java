import java.util.Scanner;

// Interface for Shape
interface Shape {
    double calculateArea();
}

// Implementation of Rectangle
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Implementation of Triangle
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculate area of a rectangle
        System.out.println("Enter length and width of the rectangle:");
        double rectLength = scanner.nextDouble();
        double rectWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectLength, rectWidth);
        double rectArea = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + rectArea);

        // Calculate area of a triangle
        System.out.println("Enter base and height of the triangle:");
        double triBase = scanner.nextDouble();
        double triHeight = scanner.nextDouble();
        Triangle triangle = new Triangle(triBase, triHeight);
        double triArea = triangle.calculateArea();
        System.out.println("Area of the triangle: " + triArea);
    }
}
