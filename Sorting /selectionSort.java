public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes herent
        for(int i=0;i<arr.length-1;i++){
            int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[idx])
                idx=j;
            }
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
    }
}
