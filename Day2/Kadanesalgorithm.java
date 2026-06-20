import java.util.*;
public class Kadanesalgorithm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enthe the size of array: ");
        int n=sc.nextInt();
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int[] nums=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();                             
        }
        for(int i=0;i<n;i++){
            currentsum+=nums[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println(maxsum);
        sc.close();
    }
}
