import java.util.Scanner;

/*(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.
*/
public class countpositive_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positive=0;
       int  count=0;
       int negative=0;
       double total =0;
        System.out.println("enter interger value u want");
        int n=sc.nextInt();
        if (n==0){
            System.exit(1);
        }
        while(n!=0){
        if(n>0)
        {
            positive++;
        }
        else
            negative++;
            total +=n;
            count++;
             n=sc.nextInt();
    }
        double avg=total/count;
        System.out.println("no of positive"+positive);
        System.out.println("no of negative"+negative);
        System.out.println("no of total"+total);
        System.out.println("no of average"+avg);
    
    

    

    }
    
}
