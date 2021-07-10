import java.util.Scanner;

/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
*/

public class Secondhighest {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the no of students: ");
        int n=sc.nextInt();
        int i;
        String highestscorer=" ",secondhighestscorer=" ";
        int highest=0,secondhighest=0;

        for(i=1;i<=n;i++){
        System.out.print("student "+i+"\n name:");
        String name=sc.next();
        System.out.print("score:");
        int score=sc.nextInt();
        if(i==0)
        {
            highest=score;
            highestscorer=name;
        }
        if(i==1&& score>highest){
            secondhighest=highest;
            secondhighestscorer=highestscorer;
            highest=score;
            highestscorer=name;
        }
        else if (i == 1) {
            
            secondhighest = score;
            secondhighestscorer = name;
        }		
        else if (i > 1 && score > highest ) {
           
            secondhighest = highest;
            secondhighestscorer=highestscorer;
            highest = score;
            highestscorer= name;
        }
        else if (i > 1 && score > secondhighest) {
           
            secondhighestscorer= name;
            secondhighest = score;
        }
    }

   
    System.out.println(
        "Higest scoring student: " +highestscorer + 
        "\nSecond Higest scoring student: " + secondhighestscorer);
}
    }

    

