public class Solution {
    public static double myPow(double x, int n) {
        // Write Your Code Here
        double res=1.0;
        double div=1/x;
        if(n<0){
        
             res=Math.pow(div,-n);
        }
       
        else
        res=Math.pow(x, n);
        return res;
    }
}
