package leetcode;

public class MaximumDepthOfBinaryTree {
    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        getMaxDepth(root, 0);
        return maxDepth;
    }

    private void getMaxDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return;
        }
        int depth = currentDepth + 1;
        maxDepth = Math.max(maxDepth, depth);
        if (node.left != null) {
            getMaxDepth(node.left, depth);
        }
        if (node.right != null) {
            getMaxDepth(node.right, depth);
        }
    }
}


