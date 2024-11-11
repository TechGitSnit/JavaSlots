import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.print("enter your mark percenteage");
        Scanner ob=new Scanner(System.in);
        double g=ob.nextDouble();
        if (g>=90) {
        System.out.print("Grade A+  "+g+" Passed");
            
            
        }
        else if (g>=80) {
        System.out.print("Grade A "+g+" Passed");
            
        }
        else if (g>=80) {
            System.out.print("Grade B+ "+g+" Passed");
                
            }
            else if (g>=70) {
                System.out.print("Grade B "+g+" Passed");
                    
                }
                else if (g>=60) {
                    System.out.print("Grade C+ "+g+" Passed");
                        
                    }
                    else if (g>=50) {
                        System.out.print("Grade C "+g+" Passed");
                            
                        }
                        else if (g<=40) {
                            System.out.print("Grade D "+g+" Failed");
                                
                            }
    }
}
