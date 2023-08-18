import java.util.*;
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
    int original=n,count=0;
        for(;n>0;n/=10)
	{
            if(n%10==0)
            continue;
            else if(original%(n%10)==0){
                count++;
            }
        }
        return count;
    }
}
