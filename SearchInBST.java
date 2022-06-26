package sdeSheetQues;

public class SearchInBST {
    static class BinaryTreeNode<T> {
        public T data;
        public BinaryTreeNode<T> left;
        public BinaryTreeNode<T> right;

        BinaryTreeNode(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
        if(root == null) return false;
        if(root.data == x) return true;
        return root.data > x ? searchInBST(root.left, x) : searchInBST(root.right, x);
    }
}
