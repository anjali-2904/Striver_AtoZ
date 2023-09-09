public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        printNosHelp(arr,x,0);
        return arr;

    }
    public static void printNosHelp(int arr[],int x,int i){
        if(x==0)
        return;
        arr[i]=x;
        printNosHelp(arr,x-1,i+1);
    }
}
