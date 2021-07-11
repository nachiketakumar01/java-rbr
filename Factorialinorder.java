import java.util.Scanner;

/*
Q10. (Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.
*/
public class Factorialinorder {
    public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

	
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
        int index=2;
        while(n/index !=1){
            if(n%index==0){
                System.out.print(index + ", ");
				n /= index; 
			}
			else
				index++; 

		
        }  

   
    
   System.out.println(n + ".");
}}
