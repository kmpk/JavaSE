package leetcode;

public class RevertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        revertTreeNodes(root);
        return root;
    }

    private void revertTreeNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        revertTreeNodes(node.left);
        revertTreeNodes(node.right);
    }
}
