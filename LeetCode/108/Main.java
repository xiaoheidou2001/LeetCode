public class Main{
    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        System.out.println(new Solution().sortedArrayToBST(nums));
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length-1);
    }
    public TreeNode convert(int[] nums,int left,int right){
        if(left > right) return null;
        int mid = (left + right) / 2;
        return new TreeNode(nums[mid], convert(nums, left, mid-1), convert(nums, mid+1, right));
    }
}