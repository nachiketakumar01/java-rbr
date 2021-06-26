/*(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 328*/
import java.util.Scanner;


public class Celcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter CELCIUS: ");
        double cel =sc.nextDouble();
        
        double farenheit=(9 / 5) * cel + 32;
        System.out.println("farenheit:"+farenheit);
       
    }
}
