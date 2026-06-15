import java.util.*;
public class ArraySortMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("enter the no of elements in first array: ");
        m=sc.nextInt();
        System.out.println("enter the size of second array: ");
        n=sc.nextInt();
        int [] nums1=new int[m+n];
        int[] nums2=new int[n];
        System.out.println("enter the elements of first array: ");
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("enter the elements of second array: ");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        for(int i=m,j=0;i<m+n||j<n;i++,j++){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
        System.out.println("The first array is: ");
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
        sc.close();
    }
}
