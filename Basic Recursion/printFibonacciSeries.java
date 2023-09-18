public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int f=0,s=1;
        int a[]=new int[n];
        if(n==1)
        a[0]=f;
        else if(n==2){
            a[0]=f;
            a[1]=s;
        }
        else{
            a[0]=f;
            a[1]=s;
        int t;
        for(int i=2;i<n;i++){
            t=f+s;
            f=s;
            s=t;
            a[i]=t;

        }
        }
        return a;
    }
}
