public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int prev = 0;
        int max = nums[0];
        for (int i : nums) {
            prev = Math.max(prev + i, i);
            max = Math.max(max, prev);
        }
        return max;
    }
}
