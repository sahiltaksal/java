

public class inverted_right {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
