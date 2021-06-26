import java.util.Scanner;

/*
Write a program to check given number is Armstrong number or not?
Description: Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits is equal to the number itself.
For example: 
Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153 
Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634*/
public class armstrongno {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the number to check armstrong:");
        int a=sc.nextInt();
       
        int remainder,sum=0;
        int digits=1+(int)Math.floor(Math.log10(a));
       int temp=a;
        while(temp!=0)
        {
            remainder=temp%10;
            sum=sum+(int)Math.pow(remainder,digits);
            temp=temp/10;
        }
        if(sum==a){
            System.out.println("armstong no.:"+a);

        }
        else{
            System.out.println("it isnot a armstrong number");
        }
    }
   
}
