import java.util.Scanner;
/*
Q6: (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/
public class Bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mass in pound and height in inch:");
        double weight= sc.nextDouble();
        double Height= sc.nextDouble();
         final double poundtokilo=0.45359237;
        final double inchtomtr=0.0254;
        weight=weight*poundtokilo;
        Height=Height*inchtomtr;
        double bmi=weight/Math.pow(Height,2);
        System.out.println("BMI:"+bmi);
    }
}
