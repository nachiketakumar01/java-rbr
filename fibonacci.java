/*Write a program to print Fibonacci Series?
Description : Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,...... 
Hint: To find this series we add two previous terms/digits and get next term/number
*/
import java.util.Scanner;
public class fibonacci {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nmber find fibbonacci series:");
        int a=sc.nextInt();
       int b=0;
       int c=1;
       int d=0;
       System.out.print(b+" "+c);
for (int i=2;i<a;i++){
    d=b+c;
    System.out.print(" "+d);
    b=c;
    c=d;
}
    }       
}
