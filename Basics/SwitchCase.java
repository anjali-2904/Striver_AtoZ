import java.util.*;
import static java.lang.Math.PI;
public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        double res=0.0;
        switch(ch){
            case 1:{
                res=PI*a[0]*a[0];
            }
            break;
            case 2:{
                res=a[1]*a[0];
            }
            break;
        }    
        return res;
    }
}
