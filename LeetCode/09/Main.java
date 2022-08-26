import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(in.nextInt()));
        in.close();
    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x < 0) return false;
//         else if(x == 0) return true;
//         String s = Integer.toString(x);
//         int sLen = s.length();int center = s.length() / 2;
//         if(sLen % 2 == 0){
//             for(int i = 0;i <= center - 1;i ++){
//                 if(s.charAt(center-1-i) != s.charAt(center+i)) return false;
//             }
//         }
//         else{
//             for(int i = 0;i <= center;i ++){
//                 if(s.charAt(center-i) != s.charAt(center+i)) return false;
//             }
//         }
//         return true;
//     }
// }


//回文数相当于正序和逆序相同
// class Solution {
//     public boolean isPalindrome(int x) {
//         String s = Integer.toString(x);
//         StringBuffer s1 = new StringBuffer(s).reverse();
//         return s.equals(s1.toString());
//     }
// }

//通过取整与取余操作判断
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        //寻找边界
        int div = 1;
        while(x / div >= 10) div *= 10;
        while(x > 0){
            int left = x / div;
            int right = x % 10;
            if(left != right) return false;
            x = x % div / 10; div /= 100;
        }
        return true;
    }
}



