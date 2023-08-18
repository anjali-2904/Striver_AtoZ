import java.util.*;
public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int min=0,res=1;
        min=Math.min(n, m);
        for(int i=2;i<=min;i++){
            if(n%i==0 && m%i==0)
            res=i;
           
        }
        return res;
    }
}
