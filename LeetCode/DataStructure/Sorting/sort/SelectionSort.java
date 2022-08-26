package sort;
import java.util.Arrays;

public class SelectionSort {
    
    public static int[] sort(int[] nums){
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        return selectionSort(numsCopy);
    }

    private static int[] selectionSort(int[] nums){
        for(int i = 0;i < nums.length-1;i ++){
            int index = i;
            for(int j = i+1;j < nums.length;j ++){
                if(nums[j] < nums[index]){
                    index = j;
                }
            }
            swap(nums, i, index);
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
