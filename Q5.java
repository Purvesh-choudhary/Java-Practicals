import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner getdata = new Scanner(System.in);
        int array[] = new int[10]; 
        int equal=0,greater=0,less=0;

        for(int i =0 ; i<array.length ; i++){
            System.out.print("Enter data for array["+i+"] : ");
            array[i] = getdata.nextInt();
        }
        System.out.print("Enter a number for comparison : ");
        int key = getdata.nextInt();

        for(int i= 0; i<array.length; i++){
            if (array[i]==key) {
                equal++;   
            }else if (array[i]>key) {
                greater++;
            }else{
                less++;
            }
        }
        System.out.println("Equals = "+equal);
        System.out.println("Greater = "+greater);
        System.out.println("Less = "+less);

    }
}
