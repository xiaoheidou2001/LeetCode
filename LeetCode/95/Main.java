import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        test(5);
    }
    public static void test(int n){
        List<Integer> list = new ArrayList<>();
        if(n == 0) return;
        list.add(n);
        test(n - 1);
    }
}

class Solution {
    public List<TreeNode> generateTrees(int n) {
       return  findTrees(1, n);
    }

    public List<TreeNode> findTrees(int head,int rear){
        List<TreeNode> setTree = new ArrayList<>();
        if(head > rear){
            setTree.add(null);
            return setTree;
        }
        for(int i = head;i <= rear;i ++){
            List<TreeNode> leftTrees = findTrees(head, i - 1);
            List<TreeNode> rightTrees = findTrees(i + 1, rear);
            for(TreeNode left : leftTrees){
                for(TreeNode right : rightTrees){
                    TreeNode tmpTree = new TreeNode(i);
                    tmpTree.left = left;
                    tmpTree.right = right;
                    setTree.add(tmpTree);
                }
            }
        }
        return setTree;
    }
}