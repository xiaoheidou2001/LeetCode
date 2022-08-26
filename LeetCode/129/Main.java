import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1,left,right);
        System.out.println(new Solution().sumNumbers(root));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int totalSum = 0;
    public int sumNumbers(TreeNode root) {
        traverse(root, new ArrayList<>());
        return totalSum;
    }
    public void traverse(TreeNode root, List<Integer> currList){
        currList.add(root.val);
        if(root.left == null & root.right == null){
            totalSum += getNum(currList);
        } else {
            if(root.left != null){
                traverse(root.left, currList);
                currList.remove(currList.size()-1);
            }
            if(root.right != null){
                traverse(root.right, currList);
                currList.remove(currList.size()-1);
            }
        }
    }
    public int getNum(List<Integer> list){
        int res = 0;
        int x = 1;
        for(int i = list.size()-1;i >= 0;i --){
            res += list.get(i) * x;
            x *= 10;
        }
        return res;
    }
}