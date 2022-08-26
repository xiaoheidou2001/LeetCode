public class Main{
    public static void main(String args[]){
        int[] nums = {1};
        System.out.println(new Solution().findPeakElement(nums));
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int idx = 0;
        while(true){
            if(idx < 0) idx = nums.length - 2;
            else if(idx > nums.length - 1) break;
            if(nums[idx+1] > nums[idx]){
                idx++;
            } else{
                if(idx - 1 != -1 && nums[idx-1] > nums[idx]){
                    idx--;
                } else{
                    return idx;
                }
            }
        }
        return -1;
    }
}