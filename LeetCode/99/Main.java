import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node2;
        node2.right = node1;
        new Solution().recoverTree(root);
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
    public void recoverTree(TreeNode root) {
        List<TreeNode> inArray = new ArrayList<>();
        inorderT(root, inArray, new TreeNode(), new TreeNode());
    }
    public void inorderT(TreeNode root, List<TreeNode> inArray, TreeNode leftMin, TreeNode rightMax){
        if(root == null) return;
        if(root.left != null & (leftMin == null | leftMin.val > root.left.val)){
            leftMin = root.left;
        }
        if(root.right != null & (rightMax == null | rightMax.val > root.right.val)){
            rightMax = root.right;
        }
        if(leftMin.val > root.val){
            int tmp = leftMin.val;
            leftMin.val = root.val;
            root.val = tmp;
        } else if(rightMax.val < root.val){
            int tmp = rightMax.val;
            rightMax.val = root.val;
            root.val = tmp;
        }
        inorderT(root.left, inArray, leftMin, rightMax);
        inArray.add(root);
        inorderT(root.right, inArray, leftMin, rightMax);
    }
}