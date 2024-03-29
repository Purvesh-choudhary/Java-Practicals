import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price[] = new int[5];
        int total =0, average=0;

        System.out.println("Enter 5 Prices - ");
        for(int i=0 ; i<price.length ; i++){
            price[i] = scanner.nextInt();
            total += price[i];
        }

        average = total/price.length;
        System.out.println("Average = "+ average);

        System.out.println("Prices Higher Than Average are - ");
        for(int i=0 ; i<price.length ; i++){
            if (price[i]>average) {
                System.out.println(price[i]);
            }
        }
    }
}