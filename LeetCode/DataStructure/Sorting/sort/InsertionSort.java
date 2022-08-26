package sort;

import java.util.Arrays;

public class InsertionSort {
    
    public static int[] sort(int[] nums){
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        return insertionSort(numsCopy);
    }

    private static int[] insertionSort(int[] nums){
        for(int i = 1;i < nums.length;i ++){
            int tmp = nums[i];
            int j = i - 1;
            for(;j >= 0 && nums[j] > tmp;j --){
                nums[j+1] = nums[j];
            }
            nums[j+1] = tmp;
        }
        return nums;
    }
}
