package sdeSheetQues;

import java.util.*;

public class SerializeAndDeserialize {
    static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };
    static String serializeTree(TreeNode<Integer> root) {
        if(root == null) return "";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode<Integer> node = q.poll();
            if(node == null){
                res.append("n ");
                continue;
            }
            res.append(node.data).append(" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }

    static TreeNode<Integer> deserializeTree(String data) {
        if(data.equals("")) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] val = data.split(" ");
        TreeNode<Integer> root = new TreeNode<>(Integer.parseInt(val[0]));
        q.add(root);
        for(int i = 1; i < val.length; i++){
            TreeNode<Integer> parent = q.poll();
            if(!val[i].equals("n")){
                TreeNode<Integer> left = new TreeNode<>(Integer.parseInt(val[i]));
                parent.left = left;
                q.add(left);
            }
            if(!val[++i].equals("n")){
                TreeNode<Integer> right = new TreeNode<>(Integer.parseInt(val[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }
}
