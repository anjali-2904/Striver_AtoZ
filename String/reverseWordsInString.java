public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String word[]=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=word.length-1;i>=0;i--){
			sb.append(word[i]);
			if(i>0)
			sb.append(" ");
		}
		return sb.toString();
	}
}
