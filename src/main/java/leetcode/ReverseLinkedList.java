package leetcode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode next = head.next;
        ListNode current = head;
        ListNode previous = null;
        while (next != null) {
            current.next = previous;
            previous = current;
            current = next;
            next = next.next;
        }
        current.next = previous;
        return current;
    }
}
