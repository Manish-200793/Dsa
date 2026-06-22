package Day9;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        HashSet<List<Integer>>res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
             HashSet<Integer> seen=new HashSet<>();
             for(int j=i+1;j<n;j++){
                int k=-nums[i]-nums[j];
                if(seen.contains(k)){
                    res.add(Arrays.asList(nums[i],k,nums[j]));
                }
                seen.add(nums[j]);
             }
        }
        return new ArrayList<>(res);
    }
}
public class ThreeSum {
    public static void main(String[] args) {
        
        Solution sol = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = sol.threeSum(nums);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    
    }
}
