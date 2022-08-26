import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}

/**
 * 双指针问题
 * 保持第一、二重循环不变，而将第三重循环变成一个从数组最右端开始向左移动的指针
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int nLen = nums.length;

        for(int i = 0;i <= nLen - 1;i ++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int k = nLen - 1;
            for(int j = i+1;j <= nLen - 1;j ++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int tmp = nums[i] + nums[j];
                while(j < k && tmp + nums[k] > 0) k--;
                if(j == k) break;
                if(tmp + nums[k] == 0){
                    List<Integer> lst = new ArrayList<>();
                    lst.add(nums[i]);lst.add(nums[j]);lst.add(nums[k]);
                    res.add(lst);
                }

            }
        }

        return res;
    }
}

