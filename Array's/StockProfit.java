import java.util.*;
class solution{
    public int profit(int[] nums){
        int n= nums.length;
        int profit=0;
        int buy=nums[0];
        for(int i=1;i<n;i++){
            if(buy>nums[i]){
                buy=nums[i];
            }
            else if(nums[i]-buy>profit){
                profit=nums[i]-buy;
            }
        }
        return profit;
    }
}

public class StockProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter array size: ");
        n=sc.nextInt();
        System.out.println("enter array elements: ");
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        solution sol=new solution();
        int res=sol.profit(nums);
        System.out.println("the maximum profit is: "+res);
        sc.close();
    }
}
