import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        String a = "1";
        String b = "11";
        System.out.println(new Solution().addBinary(a, b));
    }
}

class Solution {
    public String addBinary(String a, String b) {
        StringBuffer res = new StringBuffer();
        int idxA = a.length() - 1;
        int idxB = b.length() - 1;
        int carry = 0;
        while(idxA >= 0 || idxB >= 0 || carry != 0){
            int currRes = 0;
            currRes += idxA >= 0 ? a.charAt(idxA) - '0' : 0;
            currRes += idxB >= 0 ? b.charAt(idxB) - '0' : 0;
            currRes += carry;
            res.append(currRes % 2);
            carry = currRes / 2;
            idxA --;idxB --;
        }
        return res.reverse().toString();
    }
}