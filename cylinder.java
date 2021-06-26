/*(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length*/
import java.util.Scanner;
public class cylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius and length: ");
        double c =sc.nextDouble();
        double d =sc.nextDouble();
        double area=3.14*c*c;
        double volume=area*d;
        System.out.println("area:"+area);
        System.out.println("volume:"+volume);
        


    }

    
}
