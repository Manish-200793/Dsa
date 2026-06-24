package Day10;
import java.util.*;
class solution{
    public List<List<Integer>> foursum(int[] nums,int target){
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int p=j+1,q=n-1;
                while(p<q){
                    long sum=(long) nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum>target){
                        q--;
                    }
                    else if(sum<target){
                        p++;
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]){
                            p++;
                        }
                    }
                }
            }
        }
        return res;
    }
}

class FourSum {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = {1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> result = sol.foursum(nums,target);
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("quadraples that sum to target:");
        for (List<Integer> quadList : result) {
            System.out.println(quadList);
        }
    }
}