public class primenumber {
public static void main(String[] args) {
    

    int num = 18;
    int count = 0;

    for(int i =1;i<=num;i++){
       if (num % i ==0) {
        count++;
       }
    }
       if(count==2){
        System.out.println("primenumber");
       }
       else{
        System.out.println("not prime");
       }
    
}}