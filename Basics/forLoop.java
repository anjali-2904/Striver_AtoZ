import java.util.*;
public class Solution {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1,s=1,t=0;
		if(n==1){
			System.out.println(f);
		}
		else if(n==2)
		System.out.println(s);
		else{
		for(int i=0;i<n-2;i++){
			t=f+s;
			f=s;
			s=t;
		}
		System.out.println(t);
		}
	}
}
