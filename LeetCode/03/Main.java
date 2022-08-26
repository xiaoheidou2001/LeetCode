import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);
        System.out.println(solution.lengthOfLongestSubstring(in.nextLine()));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
       //窗口滑动问题
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = 0;int lPtr = 0;
        for(int i = 0;i <= s.length() - 1;i ++){
            if(map.containsKey(s.charAt(i))) lPtr = Math.max(lPtr, map.get(s.charAt(i)) + 1);
            map.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, i - lPtr + 1);
        }
        return maxLen;
    }
}
