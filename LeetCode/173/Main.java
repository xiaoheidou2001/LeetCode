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

class BSTIterator {

    TreeNode iterator;

    public BSTIterator(TreeNode root) {
        this.iterator = new TreeNode(-1, root, null);
    }
    
    public int next() {
        
    }
    
    public boolean hasNext() {

    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */