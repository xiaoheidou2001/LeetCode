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

// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null) return true;
//         else return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 
//                     & isBalanced(root.left) & isBalanced(root.right);
//     }
//     public int getHeight(TreeNode root){
//         if(root == null) return 0;
//         return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
//     }
// }

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
