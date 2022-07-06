package sdeSheetQues;

import java.util.*;

public class ZigZagTraversal {
    static class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
        List<Integer> zigZag = new ArrayList<>();
        if(root == null) return zigZag;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                BinaryTreeNode<Integer> node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                int index = (leftToRight) ? i : 0;
                list.add(index, node.data);
            }
            leftToRight = !leftToRight;
            for(int i: list) zigZag.add(i);
        }
        return zigZag;
    }
}
