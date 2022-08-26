import java.util.ArrayList;
import java.util.List;

public class BST {

    class TreeNode {
        // local variables
        int val;
        TreeNode left;
        TreeNode right;

        //constructors
        public TreeNode(){
            this.val = 0;
            this.left = null;
            this.right = null;
        }
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // local variables
    TreeNode root;

    // constructors
    public BST(){
        root = null;
    }
    public BST(TreeNode root){
        this.root = root;
    }

    // insertion
    public void insert(int val){
        root = insertNode(val, root);
    }
    private TreeNode insertNode(int val,TreeNode root){
        if(root == null) return new TreeNode(val);
        if(val > root.val) root.right = insertNode(val, root.right);
        else if(val < root.val) root.left = insertNode(val, root.left);
        return root;
    }

    // search
    public boolean search(int val){
        return searchNode(val, root) == null ? false : true;
    }
    private TreeNode searchNode(int val,TreeNode root){
        if(root == null || root.val == val) return root;
        else if(val > root.val) return searchNode(val, root.right);
        else return searchNode(val, root.left);
    }

    // deletion
    public void delete(int val){
        deleteNode(val, root);
    }
    private TreeNode deleteNode(int val,TreeNode root){
        if(root == null) return root;
        if(val > root.val){
            root.right = deleteNode(val, root.right);
        } else if(val < root.val){
            root.left = deleteNode(val, root.left);
        } else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            root.val = getMin(root.right);
            root.right = deleteNode(root.val, root.right);
        }
        return root;
    }
    private int getMin(TreeNode root){
        int minVal = root.val;
        while(root.left != null){
            minVal = root.left.val;
            root = root.left;
        }
        return minVal;
    } 

    // traversals
    /* What are BFS and DFS for Binary Tree? A Tree is typically traversed in two ways:
    - Breadth First Traversal (Or Level Order Traversal)
    - Depth First Traversals
        - Inorder Traversal (Left-Root-Right)
        - Preorder Traversal (Root-Left-Right)
        - Postorder Traversal (Left-Right-Root)
    */
    public List<Integer> inorderTraversal(){
        List<Integer> res = new ArrayList<>();
        inorder(res, root);
        return res;
    }
    private void inorder(List<Integer> res, TreeNode root){
        if(root == null) return;
        inorder(res, root.left);
        res.add(root.val);
        inorder(res, root.right);
    }

    // public List<Integer> levelorderTraversal(){

    // }


    // test code
    public static void main(String[] args) {
        BST bst = new BST();
        /* BST tree example
              45 
           /     \ 
          10      90 
         /  \    /   
        7   12  50   
        */
        bst.insert(45); 
        bst.insert(10); 
        bst.insert(7); 
        bst.insert(12); 
        bst.insert(90); 
        bst.insert(50);
        System.out.println(bst.search(10));
        System.out.println(bst.search(5));
        System.out.println(bst.inorderTraversal());
        bst.delete(45);
        bst.delete(10);
        System.out.println(bst.inorderTraversal());
    }

}