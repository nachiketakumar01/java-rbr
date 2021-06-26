/*Q5. (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days.
*/
import java.util.Scanner;
public class yearsdays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE minutes: ");
        int c =sc.nextInt();
        int years = c / 525600;
		int days = c/ 1440;
System.out.println("NO. OF YRS:"+years+" \t no.of days"+days);

       }
       

    
}
