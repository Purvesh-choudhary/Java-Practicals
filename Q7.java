import java.util.Scanner;

public class Q7 {

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int digits = 0;
        int temp = originalNumber;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = originalNumber;
        while (temp != 0) {
            int digit = temp % 10;
            int poweredDigit = 1;
            for (int i = 0; i < digits; i++) {
                poweredDigit *= digit;
            }
            result += poweredDigit;
            temp /= 10;    
        }
        return originalNumber == result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];

        System.out.println("Enter " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Armstrong numbers in the array:");
        for (int number : numbers) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }
}

