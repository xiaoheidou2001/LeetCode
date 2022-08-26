import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(new Solution().isIsomorphic(s, t));
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        for(int i = 0;i < s.length();i ++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(map.containsKey(sChar)){
                if(map.get(sChar) != tChar){
                    return false;
                }
            } else if(map.containsValue(tChar)){
                return false;
            } else map.put(sChar, tChar);
        }
        return true;
    }
}