import java.util.*;
class solution {
    public int area(int [] height){
        int n=height.length;
        int left=0;
        int right=n-1;
        int max_area=0;
        while(left<right){
            int current_area=Math.min(height[right],height[left])*(right-left);
            max_area=Math.max(max_area,current_area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
    
}

public class ContainerWater {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("enter the elements: ");
        int [] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        solution sol=new solution();
        int max=sol.area(height);
        System.out.println("The maximum area is : "+max);
        sc.close();
    }
}
