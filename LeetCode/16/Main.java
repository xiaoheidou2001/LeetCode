import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,-1,-1,3};
        int target = -1;
        System.out.println(solution.threeSumClosest(nums, target));
    }
}

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int nLen = nums.length;
        int res = 10001;
        for(int i = 0;i <= nLen - 3;i ++){
            if(i > 0 && nums[i-1] == nums[i]) continue;
            int rPtr = nLen - 1;
            for(int j = i + 1;j <= nLen - 2;j ++){
                if(j > i+1 && nums[j-1] == nums[j]) continue;
                while(j < rPtr){
                    int tmp = nums[i] + nums[j] + nums[rPtr];
                    if(tmp > target){
                        if(tmp-target < Math.abs(res-target)) res = tmp;
                        rPtr--;
                    } else if(tmp == target) return target;
                    else{
                        if(target-tmp < Math.abs(res-target)) res = tmp;
                        if(rPtr < nLen - 1)rPtr++;
                        break;
                    }
                }    
            }
        }
        return res;
    }
}