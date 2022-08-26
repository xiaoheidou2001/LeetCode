public class Main{
    public static void main(String args[]){
        int[] nums = {-2,0,-1};
        System.out.println(new Solution().maxProduct(nums));
    }
}

class Solution{
    public int maxProduct(int[] nums){
        int[] res = new int[nums.length];
        res[0] = nums[0];
        int maxP = res[0];
        for(int i = 1;i < nums.length;i ++){
            res[i] = Math.max(res[i-1] * nums[i], nums[i]);
            maxP = Math.max(res[i], maxP);
        }
        return maxP;
    }
}

// [-2,3,-4]