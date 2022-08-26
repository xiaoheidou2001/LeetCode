import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("]"));
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         int ptr = 0;
//         int sLen = s.length();
//         HashMap<Character,Character> map = new HashMap<>();
//         map.put(')', '(');
//         map.put('}', '{');
//         map.put(']', '[');
//         char[] stack = new char[sLen];
//         for(int i = 0;i <= sLen - 1;i ++){
//             if(ptr == 0 || !map.containsKey(s.charAt(i)) || stack[ptr-1] != map.get(s.charAt(i))) 
//                 stack[ptr++] = s.charAt(i);
//             else ptr--;
//         }
//         if(ptr == 0) return true;
//         else return false;
//     }
// }


class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0;i < s.length(); i++){
            char tmpC = s.charAt(i);
            if(!stack.isEmpty() && map.containsKey(tmpC)){
                if(map.get(tmpC) == stack.getLast()){
                    stack.removeLast();
                } else return false;
            } else{
                stack.add(tmpC);
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}