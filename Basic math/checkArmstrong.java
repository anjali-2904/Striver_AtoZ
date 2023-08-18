import java.util.*;
import java.lang.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  org, rem, result = 0, count = 0;
        org = n;
        for (;org != 0; org /= 10, ++count);
        org = n;
        for (;org != 0; org /= 10)
        {
            rem = org % 10;
            result += Math.pow(rem, count);
        }
        if(result == n)
            System.out.println("true");
        else
            System.out.println("false");

	}
}
