import java.util.*;

import javax.print.DocFlavor.STRING;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int even=0,odd=0;
		while(num>0){
			int rem=0;
			rem=num%10;
			if(rem%2==0)
			even+=rem;
			else
			odd+=rem;
			num/=10;
		}
		System.out.println(even+" "+odd);

	}
}
