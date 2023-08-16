
import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        //String str=sc.next();
        int res=0;
        if(type.equals("Integer") ||type.equals("Float"))
        res=4;
        else if(type.equals("Long")|| type.equals("Double"))
        res=8;
        else if(type.equals("Character"))
        res=1;
        return res;
    }
}
