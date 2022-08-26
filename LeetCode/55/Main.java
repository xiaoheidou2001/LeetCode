public class Main{
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(new Solution().canJump(nums));
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int end = nums.length;
        int reach = 0;
        for(int i = 0;i <= end - 1;i ++){
            if(i <= reach){
                reach = Math.max(reach, i + nums[i]);
                if(reach >= end - 1) return true;
            }
        }
        return false;
    }
}