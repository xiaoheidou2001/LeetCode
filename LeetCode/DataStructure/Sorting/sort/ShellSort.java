package sort;

import java.util.Arrays;

public class ShellSort {
    
    public static int[] sort(int[] nums){
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        return shellSort(numsCopy);
    }

    private static int[] shellSort(int[] nums){
        int len = nums.length;
        for(int step = len / 2;step >= 1;step /= 2){
            for(int i = step;i < len;i ++){
                int tmp = nums[i];
                int j = i - step;
                for(;j >= 0 && nums[j] > tmp;j -= step){
                    nums[j+step] = nums[j];
                }
                nums[j+step] = tmp;
            }
        }
        return nums;
    }
}

// public static void shellSort(int[] arr) {
//     int length = arr.length;
//     int temp;
//     for (int step = length / 2; step >= 1; step /= 2) {
//         for (int i = step; i < length; i++) {
//             temp = arr[i];
//             int j = i - step;
//             while (j >= 0 && arr[j] > temp) {
//                 arr[j + step] = arr[j];
//                 j -= step;
//             }
//             arr[j + step] = temp;
//         }
//     }
// }
