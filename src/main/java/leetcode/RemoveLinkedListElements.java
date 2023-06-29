package leetcode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        while (secondPointer != null) {
            secondPointer = secondPointer.next;
            while (secondPointer != null && secondPointer.val == val) {
                secondPointer = secondPointer.next;
            }
            firstPointer.next = secondPointer;
            firstPointer = firstPointer.next;
        }
        return head;
    }
}
