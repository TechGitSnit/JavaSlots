import java.util.Scanner;

public class Q6 {
     public static void main(String[] args) {
        int[] a = new int[5];
        int sum=0;
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
        
        System.out.println("Summ:==");
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.print(sum);
        
    }
}
