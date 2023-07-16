package leetcode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastPointer = head;
        for (int i = 0; i < n; i++) {
            fastPointer = fastPointer.next;
        }
        if (fastPointer == null) {
            return head.next;
        }
        ListNode slowPointer = head;
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return head;
    }
}
