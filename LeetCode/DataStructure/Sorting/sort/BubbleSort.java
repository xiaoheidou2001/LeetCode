package sort;
import java.util.Arrays;

public class BubbleSort {
    
    public static int[] sort(int[] nums){
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        return bubbleSort(numsCopy);
    }

    private static int[] bubbleSort(int[] nums){
        for(int i = 0;i < nums.length - 1;i ++){
            for(int j = 0;j < nums.length - 1 - i;j ++){
                if(nums[j] > nums[j + 1]){
                    swap(nums, j, j+1);
                }
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
