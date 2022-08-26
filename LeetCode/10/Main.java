import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.isMatch(in.next(), in.next()));
        in.close();
    }
}

/**
 * WRONG!
 */
// class Solution {
//     public boolean isMatch(String s, String p) {
//         int sPtr = 0;int pPtr = 0;
//         StringBuffer tmp = new StringBuffer(s).reverse();s = tmp.toString();
//         tmp = new StringBuffer(p).reverse();p = tmp.toString();
//         while(true){
//             if(p.charAt(pPtr) == s.charAt(sPtr) || p.charAt(pPtr) == '.'){
//                 pPtr++;sPtr++;
//             } else if(p.charAt(pPtr) == '*') {
//                 int countP = 0;int countS = 0;
//                 int i = 0;int j = 0;
//                 char currC = p.charAt(++pPtr);
//                 if(currC == '.'){
//                     pPtr++;sPtr = s.length();
//                 } else{
//                     while(p.charAt(pPtr+countP) == currC || p.charAt(pPtr+countP) == '*') {
//                         if(p.charAt(pPtr+countP) == '*') countP+=2;
//                         else {countP++;i++;}
//                         if(pPtr + countP >= p.length()) break;
//                     }
//                     while(s.charAt(sPtr+countS) == currC){
//                         countS++;j++;
//                         if(sPtr + countS >= s.length()) break;
//                     }
//                     if(i > j + 1) return false;
//                     pPtr += countP;sPtr += countS;
//                 }
//             } else return false;
//             if(pPtr == p.length() && sPtr == s.length()) return true;
//             else if(sPtr == s.length()){
//                 while(p.charAt(pPtr) == '*'){
//                     pPtr += 2;
//                     if(pPtr >= p.length()) return true;
//                 }
//                 return false;
//             } else if(pPtr == p.length()) return false;
//         }
//     }
// }


/**
 * DP
 */
class Solution{
    public boolean isMatch(String s,String p){
        int sLen = s.length();
        int pLen = p.length();

        boolean[][] match = new boolean[sLen+1][pLen+1];
        match[0][0] = true;

        //要先算出来的放置于循环内部
        for(int i = 0;i <= sLen;++i){
            for(int j = 1;j <= pLen;++j){
                if(p.charAt(j - 1) == '*'){
                    match[i][j] = match[i][j-2];
                    if(matches(s, p, i, j-1)){
                        match[i][j] = match[i][j] || match[i-1][j];
                    }
                } else{
                    if(matches(s, p, i, j)){
                        match[i][j] = match[i-1][j-1];
                    }
                }
            }
        }
        return match[sLen][pLen];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}


//aab c*a*b
//aaa a*a
//ab .*
//abd .*c
//a a*ba
//aaaab c*a*aab 
//aa .*
//aaa ab*a*c*a