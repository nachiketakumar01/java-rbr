import java.util.Scanner;

/*(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.*/

public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of two pts:");
        double x1= sc.nextDouble();
        double y1= sc.nextDouble();
        double x2= sc.nextDouble();
        double y2= sc.nextDouble();
       
        double d=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
        double distance=Math.sqrt(d);
        System.out.println("distance between two pts:"+ distance);
        
    }
    
}
