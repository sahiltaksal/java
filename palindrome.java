import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check it is palindrome or not");
        int num = sc.nextInt();
        int original= num;
        int result=0;


        while (num!=0) {
          int digit=  num %  10;
          result= result *10+digit;
         num=   num /10;
       //  System.out.println(result);
        }
         if (original==result) {
            System.out.println("palindrome");
         }
         else{
            System.out.println("not palindrome");
         }
    }
    
}
