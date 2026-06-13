import java.util.*;
class Majorityelement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=sc.nextInt();
        System.out.println("enter "+n+" elements");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int freq=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}