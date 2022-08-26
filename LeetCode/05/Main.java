import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        String s = new String(in.nextLine());
        System.out.println(solution.longestPalindrome(s));
        in.close();
    }
}

/**
 * 从中部向两边扩散（先找相等序列）
 */
class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 1;int head = 0;
        for(int i = 0;i <= s.length() - 1;i ++){
            int left = i - 1;int right = i + 1;
            int currLen = 1;
            while(left >= 0 && s.charAt(left) == s.charAt(i)){
                currLen ++;left --;
            }
            while(right <= s.length() - 1 && s.charAt(right) == s.charAt(i)){
                currLen ++;right ++;
            }
            while(left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)){
                currLen += 2;
                left --;right ++;
            }
            if(currLen > maxLen){
                maxLen = currLen;
                head = left + 1;
            }
        }
        return s.substring(head, head + maxLen);
    }
}


/**
 * 
 * 动态规划
 */
// class Solution {
//     public String longestPalindrome(String s){
//         int maxLen = 1;
//         int head = 0;int rear = 0;
//         int sLen = s.length();
//         boolean[][] status = new boolean[sLen][sLen];

//         for(int right = 1; right <= sLen - 1;right ++){
//             for(int left = 0;left <= right - 1;left ++){
//                 if(s.charAt(left) == s.charAt(right) && (right - left <= 2 || status[left+1][right-1])){
//                     status[left][right] = true;
//                     if(right - left + 1 > maxLen){
//                         maxLen = right - left + 1;
//                         head = left;rear = right;
//                     }
//                 }
//             }
//         }
//         return s.substring(head, rear + 1);
//     }
// }



