import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {

        Arrays.sort(a);
        int []arr=new int[2];
        arr[0]=a[n-2];
        arr[1]=a[1];

        return arr;


    }
}
