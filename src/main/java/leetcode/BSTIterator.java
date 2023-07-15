package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class BSTIterator {
    private final Deque<Integer> deque = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        traverse(root);
    }

    private void traverse(TreeNode node) {
        if (node.left != null) {
            traverse(node.left);
        }
        deque.addLast(node.val);
        if (node.right != null) {
            traverse(node.right);
        }
    }

    public int next() {
        return deque.pollFirst();
    }

    public boolean hasNext() {
        return !deque.isEmpty();
    }
}
