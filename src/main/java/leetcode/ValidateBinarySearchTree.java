package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(root, list);
        if (list.size() < 2) {
            return true;
        }
        Iterator<Integer> iterator = list.iterator();
        int previous = iterator.next();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next <= previous) {
                return false;
            }
            previous = next;
        }
        return true;
    }

    private void fillList(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        fillList(root.left, list);
        list.add(root.val);
        fillList(root.right, list);
    }
}
