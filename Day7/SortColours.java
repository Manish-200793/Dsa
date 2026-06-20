package Day7;
import java.util.*;

class Solution {
    public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
    public void sortColors(int[] nums) {
        int low=0,mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }
        }
    }
}


public class SortColours {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        sol.sortColors(nums);
        System.out.println("After sorting:  " + Arrays.toString(nums));
    }
}
