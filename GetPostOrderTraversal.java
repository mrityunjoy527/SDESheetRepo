package sdeSheetQues;

import java.util.*;

public class GetPostOrderTraversal {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    }
    static List<Integer> l;
    public static List< Integer > getPostOrderTraversal(TreeNode root) {
        l = new ArrayList<>();
        f(root);
        return l;
    }
    static void f(TreeNode node) {
        if(node == null) return;
        f(node.left);
        f(node.right);
        l.add(node.data);
    }
}
