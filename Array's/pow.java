import java.util.*;
class solution{
    public double power(double x,int n){
        double ans=1;
        long binform=n;
        if(n==0) return 1.0;
        if(x==0) return 0.0;
        if(x==1) return 1.0;
        if(x==-1 && n%2==1) return -1.0;
        if(x==-1 && n%2==1) return 1.0;
        if(n<0){
            x=1/x;
            binform=-binform;
        }
        while(binform>0){
            if(binform%2==1){
                ans*=x;
            }
            x*=x;
            binform/=2;
        }
        return ans;
    }
}

public class pow {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x:");
        double x=sc.nextDouble();
        System.out.println("enter the n: ");
        int n=sc.nextInt();
        solution sol=new solution();
        double res=sol.power(x,n);
        System.out.println(res);
        sc.close();
    }
}