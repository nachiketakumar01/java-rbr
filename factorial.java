/*
1. Write a program to find factorial?
Description: Factorial of any number is the product of an integer and all the integers below it for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24. */
import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nmber find factorial:");
        int a=sc.nextInt();
        int factorial=1;
        
        for(int i=1;i<=a;i++){
            factorial=factorial*i;

        }
        System.out.println("factorial ofa number:"+factorial);
    }
    
}
