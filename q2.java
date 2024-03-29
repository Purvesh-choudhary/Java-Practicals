import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner getData = new Scanner(System.in);
        System.err.println("Enter Any number : ");
        long key = getData.nextLong();
        int flag=0;
        for(int i=2; i<= key; i++){   
            if (key%i==0) { 
                flag++;
            }
        }
        if(flag==1){
            System.out.println("Prime : "+ key);
        }
        else{
            System.out.println("Not Prime : "+ key);
        } 
    }
}
