import java.util.*;
class solution{
    public int[] result(int [] nums,int target){
        int n=nums.length;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
public class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size os array: ");
        int n=sc.nextInt();
        System.out.println("enter the target: ");
        int target=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        solution sol=new solution();
        int[] ans=sol.result(nums,target);
        System.out.println(Arrays.toString(ans));
       
        sc.close();
    }
}
