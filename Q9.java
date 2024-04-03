import java.util.Scanner;

public class Q9 {

    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }
    public static double calculateArea(double length , double breadth){
        return length * breadth;
    }
    public static double calculateArea(double base , double height , String shape){
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height ;
        }
        else{
            System.out.println("Invalid Shape");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Calculate area of a circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle: " + calculateArea(radius));

        // Calculate area of a rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + calculateArea(length, width));

        // Calculate area of a triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area of the triangle: " + calculateArea(base, height, "triangle"));
    }
}
