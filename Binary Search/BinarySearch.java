public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
        int res=-1;
        int low=0,mid;
        int high=nums.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                res=mid;
                break;
            }
            
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return res;
    }
}
