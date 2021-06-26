/* Q8: (Print a table) Write a program that displays the following table. Cast floatingpoint
numbers into integers.
a 		b 		pow(a, b)
1 		2 		1
2 		3 		8
3 		4 		81
4 		5 		1024
5 		6 		15625s */
import java.util.Scanner;
public class tablepower{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter value of a and b:");
       int a= sc.nextInt();
       int b=sc.nextInt();
    
      System.out.println("power of given table ");
      System.out.println("a\t"+"b\t"+"a^b\t");
     
    for(int i=1;i<=5;i++){
        
           a++;
           b++;
        int d=a;
        int e=b;
        
           int c=(int)Math.pow(d,e);
          System.out.println(a+"\t"+b+"\t"+c);

        }
    }
}