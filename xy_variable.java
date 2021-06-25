import java.util.Scanner;
/*Write a program that solves the following equation and displays the value for x and y:

3.4x + 50.2y = 44.5
2.1x + .55y = 5.9
use cramer rule*/
public class xy_variable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of integer linked with x and y  for first  variable: ");
        double c =sc.nextDouble();
        double d =sc.nextDouble();
        double b =sc.nextDouble();

        System.out.println("enter value of integer linked with x and y  for second  variable: ");
        double e =sc.nextDouble();
        double f =sc.nextDouble();
        double g =sc.nextDouble();
      double x=(f*b-g*d)/(c*f-e*d);
      double y=(g*x-b*e)/(c*f-e*d);

       
        
        System.out.println(c+"x +"+d+"y="+b);
        System.out.println(e+"x +"+f+"y="+g);
        System.out.println("value of x:"+x+"\t value of y:"+y);
        
        
    }
}
