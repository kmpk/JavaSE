package leetcode;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return checkIfSameNode(p, q);
    }

    private boolean checkIfSameNode(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        if (first.val != second.val) {
            return false;
        }
        return checkIfSameNode(first.left, second.left) && checkIfSameNode(first.right, second.right);
    }
}
