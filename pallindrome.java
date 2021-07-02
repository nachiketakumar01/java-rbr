import java.util.Scanner;



public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. to check pallindrome");
        int a= sc.nextInt();
       int reverse=0;
       int n=a;
         
       while (n>0){
        
           reverse=reverse*10+ n%10;
          n=n/10;
           
       }
       if(reverse==a){
           System.out.println("pallindrome no. is:"+reverse);
       }
       else{
           System.out.println("number is not pallindrome");
       }
    }
    
}
