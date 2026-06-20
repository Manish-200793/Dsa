import java.util.*;
class solution {
    public int result(int[] nums){
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res=res^nums[i];
        }
        return res;
    }
}
public class Singlenumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("enter elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        solution sol=new solution();
        int ans=sol.result(nums);
        System.out.println(ans);
        sc.close();
    }
}
 