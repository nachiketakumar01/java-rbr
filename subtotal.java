/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total.
*/
import java.util.Scanner;
public class subtotal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Subtotal and gratuityrate: ");
        double c =sc.nextDouble();
        double d =sc.nextDouble();
        double gratuity =c*(d/100);
        double total=gratuity+c;
        System.out.println("gratuity:"+gratuity);
        System.out.println("total:"+total);
        


    }

    
}
