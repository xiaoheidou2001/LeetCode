import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1};
        new Solution().nextPermutation(nums);
        for(int i = 0;i < nums.length;i ++){
            System.out.print(nums[i]);
        }
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        int i = 0;
        for(i = nums.length - 2;i >= 0;i --){
            if(nums[i] < nums[i+1]) break;
        }
        if(i < 0) Arrays.sort(nums);
        else {
            int j = 0;
            int min = 101;
            int minIdx = i;
            for(j = i + 1;j < nums.length;j ++){
                if(nums[j] > nums[i]){
                    if(nums[j] < min){
                        min = nums[j];
                        minIdx = j;
                    }
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = tmp;
            Arrays.sort(nums, i+1, nums.length);
        }
    }
}