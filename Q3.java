import java.util.Scanner;

public class Q3 {

    public int factorial(int key) {
        if (key <= 1) {
            return 1;
        } else {
            return key * factorial(key - 1);
        }
    }
    public void oddEven(int key){
        if(key%2==0){
            System.out.println(key + " is Even");
        }else{
            System.out.println(key +" is Odd");
        }
    }

    public boolean isPalindrome(String str){
        str = str.toLowerCase();
        str.replaceAll("\\s+", "");
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();
        Scanner getData = new Scanner(System.in);
        int key;
        System.out.print("CHOOSE ANY ONE - \n1 - Compute Factorial of a Number. \n2 - Check whether a given no. is odd or even. \n3 - check whether a given string is palindrome or not: ");
        System.out.print("\nYour Choice : ");
        int choice = getData.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a no. to find factorial(!) of : ");
                key = getData.nextInt();
                System.out.println("Factorial is - " + obj.factorial(key));
                break;

            case 2:
                System.out.print("Enter a no. : ");
                key = getData.nextInt();
                obj.oddEven(key);
                break;

            case 3:
                System.out.print("Enter a string to check if it is a palindrome : ");
                String input = getData.next();

                if (obj.isPalindrome(input)) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is not a palindrome.");
                }
                break;    

            default:
                System.out.println("Choose a valid option!");
                break;
        }
    }
}
