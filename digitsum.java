/*
Q4. (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
*/

import java.util.Scanner;
public class digitsum {
   
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER THE NUMBER: ");
    int c =sc.nextInt();
    int sum=0;
   while(c!=0){
  
    sum=sum+c%10;
    c=c/10;
   }
   
    
    System.out.println("sum of digit of a number:"+sum);
    
}
}
