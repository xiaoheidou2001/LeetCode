import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}

class Solution {
    public int romanToInt(String s) {
        int res = 0;
        HashMap<Character,Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        for(int i = 0;i <= s.length()-1;i ++){
            int tmp = map.get(s.charAt(i));
            if(i < s.length()-1 && tmp < map.get(s.charAt(i+1))){
                res -= tmp;
            } else res += tmp;
        }

        return res;
    }
}