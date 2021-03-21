package Medium;


import EZ.frequencySort;

import java.util.*;

public class Binary_Tree_Right_Side_View {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.right = new TreeNode(3);
        t.left = new TreeNode(2);
        System.out.println(rightSideView(t));
    }
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static List<Integer> rightSideView(TreeNode root) {
        addtomap(root,0);
        return new ArrayList<Integer>(map.values());
    }
    public static void addtomap(TreeNode root, int deep){
        if (root == null)
            return;
        map.putIfAbsent(deep,root.val);
        addtomap(root.right,deep+1);
        addtomap(root.left,deep+1);
    }


    public static class TreeNode {
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
}
