import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().fractionToDecimal(4, 333));
    }
}

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        String res = new String();
        int count = 0;
        while(res.length() < 10000){
            if(numerator == 0){
                res += String.valueOf(count);
                break;
            }
            if(numerator >= denominator){
                numerator -= denominator;
                count++;
            } else if(numerator < denominator){
                res += String.valueOf(count);
                numerator *= 10;
                count = 0;
            }
        }
        return res;
    }
}