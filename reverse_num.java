/*
Write a program to reverse number?
Description : Reverse number means reverse the position of all digits of any number. For example reverse of 839 is 938. 
Hint: For this program you need modulus operator concept and while loop, while loop is used for check condition and modulus used for find the remainder.
*/
import java.util.Scanner;
public class reverse_num{

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nmber find reverse:");
        int a=sc.nextInt();
        int reverse=0;
        while(a>0){
            reverse=10*reverse+a%10;
            a=a/10;
        
        }
        System.out.println("Reverse ofa number:"+reverse);
    }
}
