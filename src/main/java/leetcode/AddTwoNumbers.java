package leetcode;

public class AddTwoNumbers {
    private boolean overflow;
    private ListNode root;
    private ListNode result;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        overflow = false;
        root = null;
        result = null;
        while (l1 != null || l2 != null) {
            setNewNode(sum(l1, l2));
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (overflow) {
            setNewNode(new ListNode(1));
        }
        return root;
    }

    private void setNewNode(ListNode node) {
        if (root == null) {
            root = node;
        } else {
            result.next = node;
        }
        result = node;
    }

    private ListNode sum(ListNode l1, ListNode l2) {
        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;
        if (overflow) {
            val1++;
            overflow = false;
        }
        int sum = val1 + val2;
        if (sum > 9) {
            overflow = true;
        }
        return new ListNode(sum % 10);
    }
}
