package java;
public class armstrongnumber {
    
    public static void main(String[] args) {
        int num =153;
        int t1=num;
        int length=0;
        while (t1!=0) {
          length=length+1;
            t1=t1/10;
        }

        int t2=num;
        int arm =0;
      
        while (t2!=0) {
            int mul=1;
         int  rem=t2%10;
            for(int i=1;i<=length;i++){
                 mul=mul*rem;
            }
            
            arm = arm+mul; 
           t2= t2/10;
            
        }
        if (arm==num) {
            System.out.println("armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}
