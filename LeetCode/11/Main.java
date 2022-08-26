public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height));
    }
}

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxA = -1;
        while(left < right){
            maxA = Math.max(maxA, (right - left) * Math.min(height[left], height[right]));
            if(height[left] <= height[right]) left++;
            else right--;
        }
        return maxA;
    }
}

