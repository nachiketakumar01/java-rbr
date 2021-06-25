import java.util.Scanner;
/*Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
						area = width * height */
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length and height: ");
        double c =sc.nextDouble();
        double d =sc.nextDouble();

        double area=c*d;
        double perimeter=2*(d+c);
        System.out.println("area:"+area);
        System.out.println("perimeter:"+perimeter);
        


    }
    
}
