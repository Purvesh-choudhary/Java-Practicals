import java.util.Scanner;

public class Q4 {

    // Method to calculate the sum of digits of an integer
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Method to calculate the product of digits of an integer
    public static int productOfDigits(int number) {
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    // Method to reverse an integer
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int inputNumber = scanner.nextInt();

        int sum = sumOfDigits(inputNumber);
        int product = productOfDigits(inputNumber);
        int reversedNumber = reverseInteger(inputNumber);

        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
        System.out.println("Reversed integer: " + reversedNumber);
    }
}
