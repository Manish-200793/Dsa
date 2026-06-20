import java.util.*;
class solution{
    public int[] missing(int[][] grid){
        int n=grid.length;
        int size=n*n;
        int repeated=0,missing=0;
        int[] freq=new int[size+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                freq[grid[i][j]]++;
            }
        }
        for(int i=1;i<size+1;i++){
            if(freq[i]==2){
                repeated=i;
            }
            if(freq[i]==0){
                missing=i;
            }
        }
        return new int[]{repeated,missing};
    }
}

public class MissingRepeatedValues {
    public static void main(String[] args) {
        int[][] grid={
            {1,2,3},
            {2,4,6},
            {7,8,9}
        };
        solution sol=new solution();
        int[] result=sol.missing(grid);
        System.out.println(Arrays.toString(result));
    }
} 