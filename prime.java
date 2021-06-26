/*
5. Write a program to check the given number is prime or not?
*/
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println( "enter the number to check prime:");
        int a=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<Math.ceil(Math.sqrt(a));i++){       //for(i=2,;i<a/2;i++) is also true but time compl is more
            if (a%i==0){
                isprime=false;
                break;
            }
        }
if(isprime){
    System.out.println("Prime number is:"+a);

}
else{
    System.out.println("it is not prime number");
}
    }
    
}
