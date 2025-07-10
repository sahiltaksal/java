public class LeetCode1295 {

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums)); // Output should be 2
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (even(i)) { // pass i instead of count
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofdigit = digit(num);
        return numberofdigit % 2 == 0;
    }

    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
