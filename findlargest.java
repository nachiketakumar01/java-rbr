/*
Write a program to Find Largest Number Among Three Numbers
Input three number from user and compare these number with each others and find largest number among these three numbers */
import java.util.Scanner;

public class findlargest {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
      System.out.println(" ENTER the three number to find greatest:");
       int a=sc.nextInt();
       int b= sc.nextInt();
       int c=sc.nextInt();
       int largest=a;
       if(b>a && b>c )
       {
           largest=b;
           System.out.println("largest:"+b);
       }
       else if(c>a && c>b){
        System.out.println("largest:"+c);
        largest=c;
       }
       else{

           System.out.println("Largest:"+a);
       }

       }
   } 
    

