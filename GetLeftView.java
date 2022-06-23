package sdeSheetQues;

import java.util.*;

public class GetLeftView {
    static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;
        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static ArrayList<Integer> getLeftView(TreeNode<Integer> root) {
        ArrayList<Integer> l = new ArrayList<>();
        f(root, 0, l);
        return l;
    }
    static void f(TreeNode<Integer> node, int level, ArrayList<Integer> l) {
        if(node == null) {
            return;
        }
        if(level == l.size()) {
            l.add(node.data);
        }
        f(node.left, level + 1, l);
        f(node.right, level + 1, l);
    }
}
