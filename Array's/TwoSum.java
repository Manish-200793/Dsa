import java.util.*;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter teh size os array: ");
        int n=sc.nextInt();
        System.out.println("enter the target: ");
        int target=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.print("the indeixes are "+i+" "+j);
                }
            }
        }
        sc.close();
    }
}
