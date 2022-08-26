public class Main {
    public static void main(String[] args) {
        System.out.print(new Solution().searchRange(new int[]{1}, 1));
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int idx = -1;
        while(left <= right){
            int mid = (right + left) / 2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(idx == -1) return new int[]{-1,-1};
        int i = idx;
        while(i < nums.length && nums[i] == nums[idx]) i++;
        int j = idx;
        while(j >= 0 && nums[j] == nums[idx]) j--;
        return new int[]{j+1,i-1};
    }
}