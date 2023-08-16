import java.util.*;
public class Solution {
    public static String compareIfElse(int a, int b) {
        String res="";
        if(a>b)
        res="greater";
        else if(a<b)
         res="smaller";
        else
        res="equal";
        return res;
    }
}
