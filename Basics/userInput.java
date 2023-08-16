import java.util.*;
import java.lang.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.next();
        char c=str.charAt(0);
        if(Character.isUpperCase(c))
        System.out.println("1");
        else if(Character.isLowerCase(c))
        System.out.println("0");
        else
        System.out.println("-1");
    }
}
