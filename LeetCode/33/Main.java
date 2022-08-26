public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        int target = 1;
        System.out.print(new Solution().search(nums, target));
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         if(target < nums[0]){
//             if(target > nums[nums.length-1]){
//                 return -1;
//             } else{
//                 for(int i = nums.length-1;i >= 0;i --){
//                     if(nums[i] == target){
//                         return i;
//                     } else if(nums[i] < target){
//                         return -1;
//                     }
//                 }
//             }
//         } else {
//             for(int i = 0;i < nums.length;i ++){
//                 if(nums[i] == target){
//                     return i;
//                 } else if(nums[i] > target){
//                     return -1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}