import java.util.Scanner;

public class Q5 {
     public static void main(String[] args) {
        int[] a = new int[10];
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
        
        System.out.println("Entered numbers are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
    }
}
