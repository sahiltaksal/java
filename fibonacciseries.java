import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number series you want");
        int num = sc.nextInt();
     
        int firstnum = 0;
        int secondnum = 1;
        int nextnum;
        for(int i =1;i<=num;i++){
            System.out.println(firstnum + ",");
            nextnum= firstnum+secondnum;
            firstnum= secondnum;
            secondnum=nextnum;
        }
        
    }
}
