import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author mqy
 * 输入样例：
 * 2 4
 * 1 2 3 4 5 6
 */


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        int c1 = in.nextInt();int c2 = in.nextInt();
        int[] nums1 = new int[c1];int[] nums2 = new int[c2];
        for(int i = 0;i <= c1 - 1;i ++){
            nums1[i] = in.nextInt();
        }
        for(int i = 0;i <= c2 - 1;i ++){
            nums2[i] = in.nextInt();
        }
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
        in.close();
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ptr1 = 0;int ptr2 = 0;int curr = 0;
        int place = (nums1.length + nums2.length) / 2 + 1;
        int flag = (nums1.length + nums2.length) % 2;
        double tmp = 0;double prev = 0;
        while(ptr1 <= nums1.length - 1 && ptr2 <= nums2.length - 1){
            if(nums1[ptr1] <= nums2[ptr2])
                tmp = nums1[ptr1++];
            else 
                tmp = nums2[ptr2++];
            curr++;
            if(curr == place){
                if(flag == 1) return tmp;
                else return (tmp + prev) / 2;
            }
            prev = tmp;
        }
        if(ptr1 <= nums1.length - 1){
            tmp = nums1[place - curr + ptr1 - 1];
            if(flag == 1) return tmp;
            else if(flag == 0){
                if(place - curr == 1) return (tmp + prev) / 2;
                else return (tmp + nums1[place - curr + ptr1 - 2]) / 2;
            }
        }
        else {
            tmp = nums2[place - curr + ptr2 - 1];
            if(flag == 1) return tmp;
            else if(flag == 0){
                if(place - curr == 1) return (tmp + prev) / 2;
                else return (tmp + nums2[place - curr + ptr2 - 2]) / 2;
            }
        }
        return 0;
    }
}