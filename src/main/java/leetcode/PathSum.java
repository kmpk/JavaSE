package leetcode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return checkSum(root, 0, targetSum);
    }

    private boolean checkSum(TreeNode node, int currentSum, int targetSum) {
        if (node==null){
            return false;
        }

        int sum = currentSum + node.val;

        if (node.left == null && node.right == null) {
            return sum == targetSum;
        }

        return checkSum(node.left, sum, targetSum) || checkSum(node.right, sum, targetSum);
    }
}
