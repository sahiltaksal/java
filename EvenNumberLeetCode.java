public class EvenNumberLeetCode {
    public static void main(String[] args) {

        int[] nums = { 12, 345, 2, 6, 7896, 333 };
        int count = 0;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            while (num > 0) {

                num = num / 10;
                length++;

            }

            System.out.println(length);

            if (length % 2 == 0) {
                count++;
            }
        }

        System.out.println("hi");
        System.out.println(count);

    }
}