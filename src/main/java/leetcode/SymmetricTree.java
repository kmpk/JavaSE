package leetcode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkSymmetry(root.left, root.right);
    }

    private boolean checkSymmetry(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        if (first.val != second.val) {
            return false;
        }
        if (!checkIfSameNode(first.left, second.right) || !checkIfSameNode(first.right, second.left)) {
            return false;
        }
        return checkSymmetry(first.left, second.right) && checkSymmetry(first.right, second.left);
    }

    private boolean checkIfSameNode(TreeNode first, TreeNode second) {
        if (first == null && second == null) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        return first.val == second.val;
    }
}
