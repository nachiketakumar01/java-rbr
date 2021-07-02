/*
4. Write a program to print following pattern?
Input : n = 5
Output: 
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * * 
        * 
*/

public class reversetriangle {
    public static void main(String[] args) {
       
        int i, j, k;
        for(i=5;i>=1;i--) {
            for(j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(j=1;j<(i*2);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    }
    
