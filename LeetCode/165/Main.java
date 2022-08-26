public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().compareVersion("1.2", "1.10"));
    }
}

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int ptr = 0;
        while(ptr <= str1.length - 1 && ptr <= str2.length - 1){
            if(getNumber(str1[ptr]) > getNumber(str2[ptr])) return 1;
            else if(getNumber(str1[ptr]) < getNumber(str2[ptr])) return -1;
            ptr ++;
        }
        if(ptr <= str1.length - 1){
            for(;ptr < str1.length;ptr++){
                if(getNumber(str1[ptr]) != 0) return 1;
            }
        }
        else if(ptr <= str2.length - 1){
            for(;ptr < str2.length;ptr++){
                if(getNumber(str2[ptr]) != 0) return -1;
            }
        }
        return 0;
    }
    public int getNumber(String str){
        int res = 0;
        int x = 1;
        for(int i = str.length()-1;i >= 0;i --){
            res += (str.charAt(i) - '0') * x;
            x *= 10;
        }
        return res;
    }
}