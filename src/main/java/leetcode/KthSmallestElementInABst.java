package leetcode;

public class KthSmallestElementInABst {
    private int currentK;
    private int k;

    private Integer result;

    public int kthSmallest(TreeNode root, int k) {
        currentK = 0;
        this.k = k;
        result = null;
        findSmallest(root);
        return result;
    }

    private void findSmallest(TreeNode node) {
        if (node == null || result != null) {
            return;
        }
        findSmallest(node.left);
        currentK++;
        if (currentK == k) {
            result = node.val;
        }
        findSmallest(node.right);
    }
}
