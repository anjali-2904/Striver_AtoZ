import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		HashSet<Integer> newList=new HashSet<>();
		// for(int i:arr){
		// 	if(!newList.contains(i))
		// 	newList.add(i);
		// }
		newList.addAll(arr);
		return newList.size();
	}
}
