import javax.print.event.PrintJobListener;

/*(Summation of a series) Write a program that displays the result of
				1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9.*/
public class Summation {
    public static void main(String[] args) {
        int sum=0;
        for( int i=1;i<10;i++){
           sum=sum+i;
           System.out.println(sum);
        }
        System.out.println("summation:");
        System.out.println(sum);
    }
    
}
