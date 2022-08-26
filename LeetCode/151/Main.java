import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String args[]){
        System.out.println(new Solution().reverseWords("    the   sky  is    blue  "));
    }
}

// class Solution{
//     public String reverseWords(String s){
//         s = s.trim();
//         List<String> strList = Arrays.asList(s.split("\\s+"));
//         Collections.reverse(strList);
//         return String.join(" ", strList);
//     }
// }

class Solution{
    public String reverseWords(String s){
        int idx = s.length() - 1;
        int flag = 0;
        String tmp = new String();
        List<String> strList = new ArrayList<>();

        while(idx >= 0){
            if(s.charAt(idx) == ' ' & flag == 1){
                flag = 0;
                strList.add(reverseString(tmp));
                tmp = "";
            } else if(s.charAt(idx) != ' ' & flag == 0){
                flag = 1;
                tmp += s.charAt(idx);
            } else if(flag == 1){
                tmp += s.charAt(idx);
            }
            idx --;
        }
        if(tmp != "") strList.add(reverseString(tmp));

        return String.join(" ", strList);
    }

    String reverseString(String s){
        String newStr = new String();
        for(int i = s.length() - 1;i >= 0;i --){
            newStr += s.charAt(i);
        }
        return newStr;
    }
}