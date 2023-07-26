package leetcode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;
        ListNode odd = null;

        ListNode evenHead = null;
        ListNode even = null;

        boolean isOdd = true;
        while (current != null) {
            if (isOdd) {
                if (odd != null) {
                    odd.next = current;
                }
                odd = current;
            } else {
                if (even == null) {
                    evenHead = current;
                    even = current;
                } else {
                    even.next = current;
                    even = even.next;
                }
            }
            isOdd = !isOdd;
            ListNode next = current.next;
            current.next = null;
            current = next;
        }
        if (odd != null) {
            odd.next = evenHead;
        }
        return head;
    }
}
