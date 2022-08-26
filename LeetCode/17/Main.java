import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations(""));
    }
}

class Solution {

    HashMap<Character,String> map = new HashMap<Character,String>(){{
    put('2', "abc");put('3', "def");
    put('4', "ghi");put('5', "jkl");
    put('6', "mno");put('7', "pqrs");
    put('8', "tuv");put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0) return res;
        getRes(digits, 0, new StringBuffer(), res);
        return res;
    }

    void getRes(String digits,int ptr,StringBuffer oneRes,List<String> res){
        if(ptr == digits.length()){
            res.add(oneRes.toString());
            return;
        }
        String tmpS = map.get(digits.charAt(ptr));
        int tmpSLen = tmpS.length();
        for(int i = 0;i <= tmpSLen - 1;i ++){
            oneRes.append(tmpS.charAt(i));
            getRes(digits, ptr+1, oneRes, res);
            oneRes.deleteCharAt(ptr);
        }
    }


}