import sort.BubbleSort;
import sort.InsertionSort;
import sort.QuickSort;
import sort.SelectionSort;

// https://www.runoob.com/w3cnote/ten-sorting-algorithm.html
public class App {
    public static void main(String[] args) {
        int[] nums = new int[]{6,2,7,5,3,1,4,8,9};
        for(int i : QuickSort.sort(nums)) System.out.printf("%d ",i);
        System.out.println();
        for(int i : BubbleSort.sort(nums)) System.out.printf("%d ",i);
        System.out.println();
        for(int i : SelectionSort.sort(nums)) System.out.printf("%d ",i);
        System.out.println();
        for(int i : InsertionSort.sort(nums)) System.out.printf("%d ",i);
    }
}
