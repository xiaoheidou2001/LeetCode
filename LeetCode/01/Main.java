import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int i,j;
//         int[] res = new int[2];
//         for(i = 0;i <= nums.length - 2;i ++){
//             for(j = i + 1;j <= nums.length - 1;j ++){
//                 if(nums[i] + nums[j] == target){
//                     res[0] = i;res[1] = j;
//                     return res;
//                 }
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i <= nums.length - 1;i ++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                res[0] = i;res[1] = map.get(tmp);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}