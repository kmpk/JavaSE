package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        fillLevelList(root, 0, list);
        return list;
    }

    private void fillLevelList(TreeNode node, int level, List<List<Integer>> list) {
        if (node == null) {
            return;
        }
        while (list.size() < level + 1) {
            list.add(new ArrayList<>());
        }
        List<Integer> integers = list.get(level);
        integers.add(node.val);
        fillLevelList(node.left, level + 1, list);
        fillLevelList(node.right, level + 1, list);
    }
}
