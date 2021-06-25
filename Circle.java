/*(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
					perimeter = 2 * radius * pi
					area = radius * radius * pi*/
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius: ");
        double c =sc.nextDouble();
        double area=3.14*c*c;
        double perimeter=2*3.14*c;
        System.out.println("area:"+area);
        System.out.println("perimeter:"+perimeter);
        


    }
    
}
