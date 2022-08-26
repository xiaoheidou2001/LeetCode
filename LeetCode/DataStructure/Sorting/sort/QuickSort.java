package sort;
import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int[] nums){
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        return quickSort(numsCopy, 0, numsCopy.length-1);
    }

    private static int[] quickSort(int[] nums, int left, int right){
        if(left < right){
            int partitionIndex = partition(nums, left, right);
            quickSort(nums, left, partitionIndex-1);
            quickSort(nums, partitionIndex+1, right);
        }
        return nums;
    }

    private static int partition(int[] nums, int left, int right){
        int pivot = left;
        int index = pivot + 1;
        for(int i = index;i <= right;i ++){
            if(nums[i] < nums[pivot]){
                swap(nums, i, index);
                index++;
            }
        }
        swap(nums, pivot, index-1);
        return index-1;

    }

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}