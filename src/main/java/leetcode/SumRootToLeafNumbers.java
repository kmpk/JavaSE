package leetcode;

import java.util.concurrent.atomic.AtomicInteger;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        AtomicInteger sum = new AtomicInteger();
        traverse(root, 0, sum);
        return sum.get();
    }

    private void traverse(TreeNode node, int current, AtomicInteger sum) {
        current = current * 10 + node.val;

        if (node.right == null && node.left == null) {
            sum.addAndGet(current);
        }
        if (node.right != null) {
            traverse(node.right, current, sum);
        }
        if (node.left != null) {
            traverse(node.left, current, sum);
        }
    }
}
