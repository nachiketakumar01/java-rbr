import java.util.Scanner;

/*
    (Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.*/
public class countdays_inmonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter month and year number:");
        int n=sc.nextInt();
        int m=sc.nextInt();
         boolean leapyr=(m % 4 == 0 && m % 100 != 0) || (m % 400 == 0);
        if(n==1)
        {
            System.out.println("january has 31 days");
        }
        
        if(n==2 && leapyr==true)
        {
            System.out.println("feb has 29 days");
        }
        if(n==2 && leapyr==false)
        {
            System.out.println("feb has 28 days");
        }
        if(n==3)
        {
            System.out.println("march has 31 days");
        }
        if(n==4)
        {
            System.out.println("april has 30 days");
        }
        if(n==5)
        {
            System.out.println("may has 31 days");
        }
        if(n==6)
        {
            System.out.println("june has 30 days");
        }
        if(n==7)
        {
            System.out.println("july has 31 days");
        }
        if(n==8)
        {
            System.out.println("august has 31 days");
        }
        if(n==9)
        {
            System.out.println("sep has 30 days");
        }
        if(n==10)
        {
            System.out.println("oct has 31 days");
        }
        if(n==11)
        {
            System.out.println("november has 30 days");
        }
        if(n==12)
        {
            System.out.println("december has 30 days");
        }
       
    }
    
}
