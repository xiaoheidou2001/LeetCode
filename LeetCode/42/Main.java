import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(new Solution().trap(height));
    }
}


// Time Limit Exceeded
// class Solution {
//     public int trap(int[] height) {
//         int res = 0;
//         int flag = 0;
//         int currHeight = 1;
//         List<Integer> list = new ArrayList<>();
//         while(true){
//             for(int i : height){
//                 if(i >= currHeight){
//                     list.add(1);
//                     flag = 1;
//                 } else list.add(0);
//             }
//             if(flag == 0) break;
//             res += getCurrRes(list);
//             flag = 0;
//             list.clear();
//             currHeight ++;
//         }
//         return res;
//     }
//     private int getCurrRes(List<Integer> list){
//         int currRes = 0;
//         int tmpRes = 0;
//         int flag = 0;
//         for(int i = 0;i < list.size();i ++){
//             if(flag == 0 && list.get(i) == 0){
//                 ;
//             } else if(flag == 0 && list.get(i) == 1){
//                 flag = 1;
//                 tmpRes = 0;
//             } else if(flag == 1 && list.get(i) == 0){
//                 tmpRes ++;
//             } else {
//                 currRes += tmpRes;
//                 tmpRes = 0;
//             }
//         }
//         return currRes;
//     }
// }

class Solution {
    public int trap(int[] height) {
        
    }
}

// class Solution {
//     public int trap(int[] height) {
//         int n = height.length;
//         if (n == 0) {
//             return 0;
//         }

//         int[] leftMax = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; ++i) {
//             leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//         }

//         int[] rightMax = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; --i) {
//             rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//         }

//         int ans = 0;
//         for (int i = 0; i < n; ++i) {
//             ans += Math.min(leftMax[i], rightMax[i]) - height[i];
//         }
//         return ans;
//     }
// }