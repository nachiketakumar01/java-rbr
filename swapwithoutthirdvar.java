/*
3. Write a java program to swap two variables?
*/
import java.util.Scanner;

public class swapwithoutthirdvar {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two number");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        
        System.out.println("number before swapping: a="+a+"b= "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("number after swapping: a="+a+"b= "+b);
    
}  
}
