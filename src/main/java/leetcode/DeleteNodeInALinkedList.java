package leetcode;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        if (node.next.next == null) {
            node.next = null;
        } else {
            deleteNode(node.next);
        }
    }
}
