import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,0,1};
        System.out.println(new Solution().longestConsecutive(nums));
    }
}

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length == 0) return 0;
//         for(int i = 1;i < nums.length;i ++){
//             int tmp = nums[i];
//             int j = 0;
//             for(j = i - 1;j >= 0;j --){
//                 if(tmp < nums[j]){
//                     nums[j+1] = nums[j];
//                 } else break;
//             }
//             nums[j+1] = tmp;
//         }
//         int maxCount = 0;
//         int currCount = 1;
//         for(int i = 0;i < nums.length - 1;i ++){
//             if(nums[i+1] - nums[i] == 1){
//                 currCount++;
//             } else if(nums[i+1] - nums[i] != 0){
//                 maxCount = Math.max(maxCount, currCount);
//                 currCount = 1;
//             }
//         }
//         maxCount = Math.max(maxCount, currCount);
//         return maxCount;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}