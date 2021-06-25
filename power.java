
import java.util.Scanner;

/*(Print a table) Write a program that displays the following table:
a	 a^2    a^3
1	 1 		1
2	 4 		8
3	 9 		27
4	 16     648 */
public class power {
    public static void main(String[] args) {
       Scanner soc=new Scanner(System.in);
       System.out.println("enter the input");
        int a=soc.nextInt();
        System.out.println("a  \t a^2 \t a^3");
        
        for (int i=1;i<=a;i++){
        int c=(int)Math.pow(i,2);
            int d= (int)Math.pow(i,3);
        
        int e=i;
          
        
        System.out.printf("%d\t %d\t%d\t",e,c,d);
        System.out.println("");
         

        }
}
}
