import java.util.Scanner;

/*Q6. (Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.
*/
public class Heightestmarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the no of student u want to put:");
        int n=sc.nextInt();
       int highest=0;
String  scorer="";
        int i;
        
        
        for ( i=1;i<=n;i++){
            System.out.print("student name \t"+ i );
           
           String name=sc.next();
           System.out.print("score:");
            int marks=sc.nextInt();
            if(marks>highest){
            highest=marks;
            scorer=name;
            }
        }
        System.out.println("student "+" has highest marks of "+highest+" named "+scorer);
       


    }
   
   
}
