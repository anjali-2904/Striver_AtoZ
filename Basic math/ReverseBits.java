import java.util.*;
public class Solution {
	public static long reverseBits(long n) {
		// Write your code here
		StringBuilder sb=new StringBuilder();
		while(n>0){
			sb.append(n%2);
			n/=2;
		}
		long zeroToAdd=32-sb.length();
		for(int i=0;i<zeroToAdd;i++)
		sb.append(0);
		sb.reverse();
		long rev=0,base=1;
		for(int i=0;i<32;i++)
		{
			if(sb.charAt(i)=='1')
			rev=rev+base;
			base*=2;
		}
		return rev;
	}
}
