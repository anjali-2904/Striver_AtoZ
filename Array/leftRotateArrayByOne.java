import java.util.* ;
import java.io.*; 
public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            a[j]=arr[i+1];
            j++;
        }
        a[j]=arr[0];
        return a;

    }
}
