import java.util.Scanner;
/*
1. Find largest number among three numbers using ternary operator?
*/
public class largestusingternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three number to find largest:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest;
largest=a>b?(a>c?a:c):(b>c?b:c);
System.out.println("largest:"+largest);
    }
}
