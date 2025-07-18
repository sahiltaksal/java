//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=problem-list-v2&envId=array
public class Leetcode34 {

    public static void main(String[] args) {

        int []nums={5,7,7,8,8,10};
    System.out.println(search(nums, 8, true));
    System.out.println(search(nums, 8, false));
    
    }

    public static int[] searchRange(int[] nums, int target) {

        int ans[]={-1,-1};
        int low=search(nums, target, true);
        int high=search(nums, target, false);
        ans[0]=low;
        ans[1]=high;
        return ans;
    }

    static int search(int nums[],int target,boolean startindex){
        int ans =-1;
int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (target<nums[mid]) {
                high -= 1;

            } else if (target>nums[mid]) {
                 low+=1;
            }else{

                ans=mid;
               if (startindex==true) {
                high=mid-1;
               }
               else{

            low=low+1;
               }
            }
            
        }
    return ans;
}
}
   

    

