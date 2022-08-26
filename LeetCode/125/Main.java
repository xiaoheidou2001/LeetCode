public class Main{
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("race a car"));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String newStr = new String();
        for(int i = 0;i < s.length();i ++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newStr += Character.toLowerCase(s.charAt(i));
            }
        }
        int left = 0;int right = newStr.length()-1;
        while(left != right & left < newStr.length() & right > 0){
            if(newStr.charAt(left) != newStr.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}