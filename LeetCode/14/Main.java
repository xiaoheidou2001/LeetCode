public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[3];
        strs[0] = "alower";strs[1] = "flow";strs[2] = "flight";
        System.out.println(solution.longestCommonPrefix(strs));
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strsLen = strs.length;
        int minLen = 201;
        String res = new String();
        for(int i = 0;i <= strsLen - 1;i ++)
            minLen = Math.min(minLen, strs[i].length());
        for(int i = 0;i <= minLen - 1;i ++){
            char tmp = strs[0].charAt(i);
            for(int j = 1;j <= strsLen - 1;j ++){
                if(strs[j].charAt(i) != tmp) return res;
            }
            res += tmp;
        }
        return res;
    }
}