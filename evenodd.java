/*2. Write a program to find given number is odd or even?
*/
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  number");
        float a=sc.nextFloat();
       
       if(a%2==0){
           System.out.println("even no. is\t"+a);
       }
       else{
        System.out.println("odd no is\t:"+ a);

       }
       
    }
    
}
