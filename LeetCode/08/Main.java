import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.myAtoi(in.nextLine()));
        in.close();
    }
}

class Solution {
    public int myAtoi(String s) {
        double res = 0;
        int ptr = 0;int flag = 1;
        s = s.trim();
        if(s.isEmpty()) return 0;
        if(s.charAt(0) == '+');
        else if(s.charAt(0) == '-') flag = -1;
        else if(s.charAt(0) >= '0' && s.charAt(0) <= '9') res += s.charAt(ptr) - '0';
        else return 0;
        while(++ptr <= s.length() - 1){
            if(s.charAt(ptr) >= '0' && s.charAt(ptr) <= '9'){
                res = res * 10 + s.charAt(ptr) - '0';
            }
            else break;
        }
        res *= flag;
        if((int)res == res) return (int)res;
        else if(res > 0) return 2147483647;
        else return -2147483648;
    }
}