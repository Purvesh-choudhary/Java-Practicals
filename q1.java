public class q1 {
    public static void main(String[] args) {
        int[] list = {34,22,112,345,53,26,236,45,2,3546,311,255,5,555,552,33,22,};
        int key=list[0];
        for(int i=0; i< list.length ; i++){
            if (key < list [i]) {
                key = list[i];
            }
        }
        System.out.println("Largest Number : "+ key);
    }
}
