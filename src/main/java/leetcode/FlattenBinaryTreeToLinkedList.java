package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        traverse(root, queue);
        TreeNode previous = queue.poll();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            previous.left = null;
            previous.right = current;
            previous = current;
        }
        previous.left = null;
        previous.right = null;
    }

    private void traverse(TreeNode node, Queue<TreeNode> queue) {
        if (node == null) {
            return;
        }
        queue.add(node);
        traverse(node.left, queue);
        traverse(node.right, queue);
    }
}
