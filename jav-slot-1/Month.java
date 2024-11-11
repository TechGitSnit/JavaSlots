import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("Enter the month  number");
        Scanner ob = new Scanner(System.in);
        int v = ob.nextInt();
        switch (v) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("oCTOBER");
                break;
            case 11:
                System.out.println("nOVEMVER");
                break;
            case 12:
                System.out.println("DECEMbER");
                break;

            default:
                System.out.println("You Fool");
        }
    }
}
