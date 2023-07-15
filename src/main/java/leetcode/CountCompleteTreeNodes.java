package leetcode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = getTreeDepth(root);

        if (depth == 1) {
            return 1;
        }
        return (int) Math.pow(2, depth - 1.0) - 1 + countLeafs(root,depth,1);
    }

    private int getTreeDepth(TreeNode node) {
        if (node.left != null) {
            return 1 + getTreeDepth(node.left);
        } else {
            return 1;
        }
    }

    private int countLeafs(TreeNode node, int depth, int currentDepth) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null && depth == currentDepth) {
            return 1;
        } else {
            return countLeafs(node.left, depth, currentDepth + 1) + countLeafs(node.right, depth, currentDepth + 1);
        }
    }
}
