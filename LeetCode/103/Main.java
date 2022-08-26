import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        TreeNode root = node1;
        System.out.println((new Solution().zigzagLevelOrder(root)));
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Element> queue = new LinkedList<>();
        queue.offer(new Element(root, 0));
        int currLevel = 0;
        int flag = 0;
        List<Integer> currRes = new ArrayList<>();
        while(!queue.isEmpty()){
            Element tmpElement = queue.poll();
            TreeNode tmpNode = tmpElement.treeNode;
            int tmpLevel = tmpElement.level;
            if(tmpLevel <= currLevel){
                currRes.add(tmpNode.val);
            } else{
                if(flag == 1){
                    Collections.reverse(currRes);
                    flag = 0;
                } else flag = 1;
                res.add(new ArrayList<>(currRes));
                currRes.clear();
                currLevel += 1;
                currRes.add(tmpNode.val);
            }
            if(tmpNode.left != null) queue.offer(new Element(tmpNode.left, tmpLevel+1));
            if(tmpNode.right != null) queue.offer(new Element(tmpNode.right, tmpLevel+1));
        }
        if(flag == 1) Collections.reverse(currRes);
        res.add(new ArrayList<>(currRes));
        return res;
    }

    class Element{
        TreeNode treeNode;
        int level;
        Element(TreeNode treeNode,int level){
            this.treeNode = treeNode;
            this.level = level;
        }
    }
}