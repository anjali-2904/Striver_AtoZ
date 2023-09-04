import java.util.*;
public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int res=-1;
        while(n>0&& m>0){
            if(n>m)
            n=n%m;
            else
            m=m%n;
            if(n==0)
            res=m;
            else
            res=n;
        }
        return res;
    }
}
