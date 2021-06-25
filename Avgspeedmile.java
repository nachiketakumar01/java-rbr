/*(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)*/

import java.util.Scanner;
public class Avgspeedmile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter distance in km and time in hour : ");
        double c =sc.nextDouble();
        double d =sc.nextDouble();
       

       double dmile =c/1.6;
       double speed = dmile/d;
       
        
        System.out.println("distance in mile:"+dmile);
        System.out.println("speed:"+speed);
        


    }
    
    
}
