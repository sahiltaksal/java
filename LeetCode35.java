//https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=array
public class LeetCode35 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };

        System.out.println(searchInsert(nums, 2));
        // System.out.println(mid);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid]==target ) {
                return mid;
            } else if (nums[mid]<target ) {
                start = mid + 1;
            } else  {
               end=mid-1;
            }
        }
        return start;
    }
}
