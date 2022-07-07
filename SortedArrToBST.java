package sdeSheetQues;

import java.util.*;

public class SortedArrToBST {
    static class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        if(arr.size() == 0) return null;
        return help(arr, 0, arr.size()-1);
    }
    static TreeNode<Integer> help(ArrayList<Integer> arr, int l, int r) {
        if(l > r) return null;
        int m = (l + r) >> 1;
        TreeNode<Integer> root = new TreeNode<>(arr.get(m));
        root.left = help(arr, l, m-1);
        root.right = help(arr, m+1, r);
        return root;
    }
}
