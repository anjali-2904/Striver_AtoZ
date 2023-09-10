
import java.util.*;
public class Solution {
    public static int[] printNos(int x) {
        int arr[]=new int[x];
        printNo(arr,0,x,1);
        return arr;       
    }
    public static void printNo(int arr[],int i,int x,int j){
        if(x==0)
        return ;
        arr[i]=j;
        printNo(arr, i+1, x-1,j+1);
    }
}
