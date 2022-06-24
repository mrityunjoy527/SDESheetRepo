package sdeSheetQues;

import java.util.Stack;

public class KthLargestNumber {
    public static class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        public TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static int KthLargestNumber(TreeNode<Integer> root, int k) {
        Stack<TreeNode<Integer>> st = new Stack<>();
        while(true) {
            if(root != null) {
                st.push(root);
                root = root.right;
            }else {
                if(st.isEmpty()) break;
                root = st.pop();
                if(--k == 0) return root.data;
                root = root.left;
            }
        }
        return -1;
    }
}
