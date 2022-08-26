public class Main{
    public static void main(String[] args) {
        // int[] nums = {6,1,1,9,1};
        // int[] nums = {1,2,3,1};
        // int[] nums = {2,7,9,3,1};
        int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,
            58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,
            64,214,228,78,188,67,205,94,205,169,241,202,144,240};
        // int[] nums = {1};
        // int[] nums = {1,2};
        System.out.println(new Solution().rob(nums));
    }
}

// class Solution {
//     int max = 0;

//     public int rob(int[] nums) {
//         getRes(nums, 0, new int[nums.length], new int[nums.length]);
//         return max;
//     }

//     void getRes(int[] nums,int idx,int[] res,int[] flag){
//         if(idx < nums.length){
//             if(idx == 0 || flag[idx-1] == 0){
//                 // choose to steal
//                 res[idx] = idx == 0 ? nums[idx] : nums[idx] + res[idx-1];
//                 flag[idx] = 1;
//                 getRes(nums, idx+1, res, flag);
//                 // choose not to steal
//                 res[idx] = idx == 0 ? 0 : res[idx-1];
//                 flag[idx] = 0;
//                 getRes(nums, idx+1, res, flag);
//             } else {
//                 // not steal
//                 res[idx] = res[idx-1];
//                 flag[idx] = 0;
//                 getRes(nums, idx+1, res, flag);
//             }
//         } else {
//             max = Math.max(res[nums.length-1], max);
//         }
//     }
// }

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int f[] = new int[nums.length];
        int g[] = new int[nums.length];
        f[0] = nums[0];f[1] = nums[1];
        g[0] = 0;g[1] = f[0];
        for(int i = 2;i < nums.length;i ++){
            f[i] = g[i-1] + nums[i];
            g[i] = Math.max(f[i-1], f[i-2]);
        }
        return Math.max(f[nums.length-1], g[nums.length-1]);
    }
}