public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        String res="NO";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            if(book[i]+book[j]==target)
            {
                res="YES";
                break;
            }

        }
        return res;
    }
}
