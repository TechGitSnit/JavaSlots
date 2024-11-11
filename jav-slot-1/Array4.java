import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int[] a=new  int[10];
        int i;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter");
        for(i=0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("entered numbers are");
        for(i=0;i<a.length;i++)
        {
            
            System.out.println(a[i]);
        }
    }
}
