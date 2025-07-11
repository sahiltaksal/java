public class Leetcode1662 {

    public static void main(String[] args) {

        int[][] accounts = { { 1, 2 }, { 3, 4 } };
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
       
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
             int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                
                sum = sum + accounts[i][j];
                
            }
            System.out.println(sum);
            if (sum>max) {

                max=sum;
                
            }

        }
     
        return max;

    }
}