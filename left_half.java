

public class left_half {
    public static void main(String[] args) {
        int num=4;
        for(int i =1;i<=num;i++){
            for(int j=4;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
