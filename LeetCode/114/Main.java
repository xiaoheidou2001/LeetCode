import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        
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
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return;
        stack.push(root);
        TreeNode currNode = null;
        while(!stack.isEmpty()){
            TreeNode tmp = stack.pop();
            if(tmp.right != null) stack.push(tmp.right);
            if(tmp.left != null) stack.push(tmp.left);
            if(currNode == null) currNode = root;
            else{
                currNode.right = tmp;currNode.left = null;
                currNode = tmp;
            }
        }
    }
}